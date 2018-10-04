DROP TABLE IF EXISTS staff;
CREATE TABLE staff (
    id           VARCHAR(255), -- 職業紹介者ID
    name         VARCHAR(255), -- 職業紹介者氏名
    kana         VARCHAR(255), -- 氏名（カナ）
    authority    VARCHAR(255), -- 権限
    password     VARCHAR(255), -- パスワード
    createdt     TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 新規登録日
    createuserid VARCHAR(255), -- 新規登録ユーザー
    updatedt     TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 最終更新日
    updateuserid VARCHAR(255), -- 最終更新ユーザー
    deleteflag   VARCHAR(255), -- 削除フラグ
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS jobcategory;
CREATE TABLE jobcategory (
    id       INTEGER,      -- 業種ID
    largecd  VARCHAR(255), -- 大分類コード
    middlecd VARCHAR(255), -- 中分類コード
    smallcd  VARCHAR(255), -- 小分類コード
    name     VARCHAR(255), -- 業種名
PRIMARY KEY (id,largecd,middlecd,smallcd)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS job;
CREATE TABLE job (
    id       INTEGER,      -- 職種ID
    largecd  VARCHAR(255), -- 大分類コード
    middlecd VARCHAR(255), -- 中分類コード
    smallcd  VARCHAR(255), -- 小分類コード
    name     VARCHAR(255), -- 職種名
PRIMARY KEY (id,largecd,middlecd,smallcd)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS kyujin;
CREATE TABLE kyujin (
    no                 VARCHAR(255), -- 求人Ｎo.
    receptiondt        DATETIME,     -- 受付年月日（西暦）
    perioddt           DATETIME,     -- 求人有効年月日
    companyno          VARCHAR(255), -- 事業所番号
    addresscd          VARCHAR(255), -- 就業場所コード
    jobsmallcd1        VARCHAR(255), -- 職種小分類コード１
    jobsmallcd2        VARCHAR(255), -- 職種小分類コード２
    jobsmallcd3        VARCHAR(255), -- 職種小分類コード３
    joblargecd1        VARCHAR(255), -- 職業大分類コード１
    joblargecd2        VARCHAR(255), -- 職業大分類コード２
    joblargecd3        VARCHAR(255), -- 職業大分類コード３
    jobcategorysmallcd VARCHAR(255), -- 産業小分類コード
    jobcategorylargecd VARCHAR(255), -- 産業大分類コード
    companykana        VARCHAR(255), -- 事業所名（かな）
    companyname        VARCHAR(255), -- 事業所名
    companypostal      VARCHAR(255), -- 事業所郵便番号
    companyplace       VARCHAR(255), -- 事業所所在地
    companyurl         VARCHAR(255), -- 事業所URL
    postal             VARCHAR(255), -- 就業場所郵便番号
    address            VARCHAR(255), -- 就業場所
    nearstation        VARCHAR(255), -- 最寄り駅
    job                VARCHAR(255), -- 職種
    hakencd            VARCHAR(255), -- 派遣／請負コード
    detail             VARCHAR(255), -- 仕事の内容
    koyoukeitaicd      VARCHAR(255), -- 雇用形態コード
    koyoukikan         VARCHAR(255), -- 雇用期間の定め
    koyoukikankaishi   DATETIME,     -- 雇用期間開始年月日
    koyoukikanowari    DATETIME,     -- 雇用期間終了年月日
    education          VARCHAR(255), -- 学歴
    experience         VARCHAR(255), -- 必要な経験等
    license            VARCHAR(255), -- 必要な免許・資格等
    agemin             INTEGER,      -- 年齢制限・下限
    agemax             INTEGER,      -- 年齢制限・上限
    salarymin          INTEGER,      -- 基本給下限
    salarymax          INTEGER,      -- 基本給上限
    salaryformcd       VARCHAR(255), -- 賃金形態コード
    begintime          INTEGER,      -- 就業時間・始業
    endtime            INTEGER,      -- 就業時間・終業
    establishdt        INTEGER,      -- 創業設立年
    capital            BIGINT,       -- 資本金
    companyfeature     VARCHAR(255), -- 会社の特長
    tantouyakushoku    VARCHAR(255), -- 選考担当者課係名/役職名
    tantoukana         VARCHAR(255), -- 選考担当者名（カナ）
    tantou             VARCHAR(255), -- 選考担当者名
    tantoustaff_id     VARCHAR(255), -- 担当職業紹介者ID
    applicationform    VARCHAR(255), -- 応募書類
    background         VARCHAR(255), -- 募集背景
    hiddensex          VARCHAR(255), -- 性別（求職者に非公開）
    hiddenagemin       INTEGER,      -- 年齢下限（求職者に非公開）
    hiddenagemax       INTEGER,      -- 年齢上限（求職者に非公開）
    hiddenetc          VARCHAR(255), -- その他非公開情報
    createdt           TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 新規登録日
    createuserid       VARCHAR(255), -- 新規登録ユーザー
    updatedt           TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 最終更新日
    upDateuserid       VARCHAR(255), -- 最終更新ユーザー
    deleteflag         VARCHAR(255), -- 削除フラグ
    PRIMARY KEY(no)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS jobseeker;
CREATE TABLE jobseeker (
    id              VARCHAR(255), -- 求職者ID
    name            VARCHAR(255), -- 求職者氏名
    kana            VARCHAR(255), -- 氏名（カナ）
    birthdt         VARCHAR(255), -- 生年月日
    sex             VARCHAR(255), -- 性別
    age             INTEGER,      -- 年齢
    postal          VARCHAR(255), -- 自宅郵便番号
    address         VARCHAR(255), -- 自宅住所
    nearstation     VARCHAR(255), -- 最寄り駅
    phone           VARCHAR(255), -- 自宅TEL
    mobile          VARCHAR(255), -- 携帯TEL
    partner         VARCHAR(255), -- 配偶者
    huyou           INTEGER,      -- 扶養家族
    education       VARCHAR(255), -- 学歴
    hopejob1        VARCHAR(255), -- 希望職種１
    hopejob2        VARCHAR(255), -- 希望職種２
    hopejob3        VARCHAR(255), -- 希望職種３
    hopejobcategory VARCHAR(255), -- 希望業種
    hopeworkplace   VARCHAR(255), -- 希望勤務地
    hopekoyoukeitai VARCHAR(255), -- 希望雇用形態
    hopeworkingdate INTEGER,      -- 希望勤務日時
    hopebegintime   INTEGER,      -- 希望勤務時間（開始）
    hopeendtime     INTEGER,      -- 希望勤務時間（終了）
    hopesalary      INTEGER,      -- 希望月給
    hopejikyu       INTEGER,      -- 希望時間給
    hopeetc         VARCHAR(255), -- その他希望
    driverlicense   VARCHAR(255), -- 自動車免許
    licenseetc      VARCHAR(255), -- その他免許
    pasokonskill    VARCHAR(255), -- パソコンスキル
    caution         VARCHAR(255), -- 留意点
    tantoustaffid   VARCHAR(255), -- 担当職業紹介者ID
    password        VARCHAR(255), -- パスワード
    createdt        TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 新規登録日
    createuserid    VARCHAR(255), -- 新規登録ユーザー
    updatedt        TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 最終更新日
    updateuserid    VARCHAR(255), -- 最終更新ユーザー
    deleteflag      VARCHAR(255), -- 削除フラグ
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS matchingcase;
CREATE TABLE matchingcase(
    id           INTEGER,      -- マッチング事例ID
    kyujinno     VARCHAR(255), -- 求人NO
    jobseekerid  VARCHAR(255), -- 求職者ID
    staffid      VARCHAR(255), -- 職業紹介者ID
    interviewdt  DATETIME,     -- 面接日
    enterdt      DATETIME,     -- 入社日
    assessment   VARCHAR(255), -- 評価
    note         VARCHAR(255), -- 備考
    createdt     TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 新規登録日
    createuserid VARCHAR(255), -- 新規登録ユーザー
    updatedt     TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 最終更新日
    updateuserid VARCHAR(255), -- 最終更新ユーザー
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS saiban;
CREATE TABLE saiban (
    jobseekersaiban INTEGER NOT NULL DEFAULT 0, -- 求職者ID採番
    kyujinsaiban    INTEGER NOT NULL DEFAULT 0, -- 求人NO採番
    companysaiban   INTEGER NOT NULL DEFAULT 0, -- 事業所番号採番
    staffsaiban     INTEGER NOT NULL DEFAULT 0 -- 職業紹介者採番
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS todouhuken;
CREATE TABLE todouhuken (
    cd        VARCHAR(255), -- 都道府県コード
    name      VARCHAR(255), -- 都道府県名
    name_kana VARCHAR(255), -- 都道府県名フリガナ
    PRIMARY KEY (`cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS koyoukeitai;
CREATE TABLE koyoukeitai (
    id INTEGER,        -- 雇用形態ID
    name VARCHAR(255), -- 雇用形態
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS salaryform;
CREATE TABLE salaryform (
    id INTEGER,        -- 給与形態ID
    name VARCHAR(255), -- 給与形態
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS career;
CREATE TABLE career (
    id          INTEGER,      -- 職歴ID
    jobseekerid VARCHAR(255), -- 求職者ID
    career      VARCHAR(255), -- 職歴
    nyusyokudt  INTEGER,      -- 入職年月
    taisyokudt  INTEGER,      -- 退職年月
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
