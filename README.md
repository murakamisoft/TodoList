# TodoList

TodoListは、タスク管理のためのシンプルなWebアプリケーションです。ユーザーがタスクを作成、表示、更新、削除できる機能を提供します。このプロジェクトは、Spring BootフレームワークとMyBatisを使用して構築されています。

## 特徴

- ユーザー管理機能（登録、ログイン）
- タスクのCRUD操作（作成、読み取り、更新、削除）
- タスクのフィルタリング
- スタイリッシュで直感的なユーザーインターフェース

## 技術スタック

- **Java**: プログラミング言語
- **Spring Boot**: アプリケーションフレームワーク
- **MyBatis**: データベースアクセスのためのORM
- **Thymeleaf**: HTMLテンプレートエンジン
- **H2 Database**: インメモリデータベース（開発時に使用）
- **Gradle**: ビルドツール

## インストール

以下の手順に従って、アプリケーションをローカル環境にセットアップしてください。

1. リポジトリをクローンします。

   ```bash
   git clone https://github.com/murakamisoft/TodoList.git
   cd TodoList
   ```

2. Gradleを使用して依存関係をダウンロードします。

   ```bash
   ./gradlew build
   ```

3. アプリケーションを実行します。

   ```bash
   ./gradlew bootRun
   ```

4. Webブラウザで `http://localhost:8080` にアクセスします。

## 使用方法

1. **ユーザー登録**: アプリケーションに新しいアカウントを作成します。
2. **ログイン**: 登録したアカウントを使用してログインします。
3. **タスク管理**:
   - 新しいタスクを追加する
   - 既存のタスクを表示する
   - タスクを更新する
   - タスクを削除する

## テスト

アプリケーションのテストを実行するには、次のコマンドを使用します。

```bash
./gradlew test
```

テスト結果は `build/reports/tests/test/index.html` に出力されます。

## ライセンス

このプロジェクトは [MIT License](LICENSE) の下でライセンスされています。

## 貢献

バグの報告や機能のリクエストは、[Issues](https://github.com/murakamisoft/TodoList/issues)で行ってください。プルリクエストも歓迎します。

## 作者

- [nori](https://github.com/murakamisoft) (GitHubプロフィール)
