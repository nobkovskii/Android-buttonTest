# Android-buttonTest
## What is this?
* Android-App test repository
  * This App changes msg when you click button.
## Env
* Mac High Sierra 10.13.6
* IntelliJ 2019.1.2（CM）
* Kotlin SDK 1.3.30
* Oracle JDK 8
* Android API 28

**※ Don't explain how to set it up**

## How to use?
* IntelliJ run
* Create New Project
  * Empty Activity　＞ 「Next」
  * Language ＞ 「Kotlin」 ＞ 「Finish」
* Replace these file
  * `app/src/main/java/com/xxx/zzz/MainActivity.kt`
    * `com/xxx/zzz` : Package name
  * `app/src/main/res/layout/activity_main.xml`
  * `app/src/main/res/values/strings.xml`
* AVD Manager
  * tools > Android > AVD Manager
  * 「+ Create Virtual Device...」
  * Phone > Nexus 5X > Next > Release Name(Download) > Finish > Next > Finish
* Run this App
  * ![image](https://user-images.githubusercontent.com/43230951/58446397-8bcc8200-813b-11e9-9c90-fcee6a6b1ef7.png)
  * ![image](https://user-images.githubusercontent.com/43230951/58446460-c46c5b80-813b-11e9-92e0-bfe8f0325563.png)

## こめんと
英語が厳しくなったので、ここから日本語。
* MainActivity.kt
  * アクション。
  * ボタン押下等の動作を記述する。
    * 今回は、ボタン押下で`flag`のOn/Offを切り替え、併せてメッセージも変わるようにしている。
* activity_main.xml
  * ビュー
  * アプリのレイアウトを記述する。
    * 今回使用している`ConstraintLayout`は、複雑なレイアウトの時に効果を発揮するようだが、デフォルトで設定されていたので、そのまま使用。
  * `app:layout_constraint~`等を設定しないと、「位置が（0,0）だぜ」エラーが発生する
* strings.xml
  * プロパティファイル的な
  
