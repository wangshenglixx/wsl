# wsl

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn
$ echo "# wsl" >> README.md

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn
$ git init
Initialized empty Git repository in D:/gitlearn/.git/

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$ git add README.md
warning: LF will be replaced by CRLF in README.md.
The file will have its original line endings in your working directory

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$ git commit -m "first commit"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'Administrator@7BT7UB5HLBTI2I6.(none)')

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$ git config --global user.email "1533660600@qq.com"

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$ git config --global user.name "wangshenglixx"

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$ git add README.md

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$ git commit -m "first commit"
[master (root-commit) a827d09] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$ git remote add origin https://github.com/wangshenglixx/wsl.git

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$ git push -u origin master



Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$ git push origin master
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 217 bytes | 36.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/wangshenglixx/wsl.git
 * [new branch]      master -> master

Administrator@7BT7UB5HLBTI2I6 MINGW64 /d/gitlearn (master)
$
