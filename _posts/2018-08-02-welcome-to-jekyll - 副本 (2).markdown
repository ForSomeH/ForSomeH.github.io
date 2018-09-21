---
layout: post
title:  "Git常用指令"
date:   2018-08-02 23:08:22 +0800
categories: jekyll update
---
##初始化
git init
##设置账号和邮箱
git config --global user.name "ForSomeH"
git config --global user.email "512964300@qq.com"
##删除账号和邮箱
git config --global --unset user.email
git config --global --unset user.name
##生成秘钥
ssh-keygen
##添加全部文件
git add .  
##克隆项目
git clone git@github.com:ForSomeH/ForSomeH.github.io.git
##关联远程库
git remote add origin git@github.com:ForSomeH/ForSomeH.github.io.git
##提交内容
git commit -m "备注"
##推送更新
git push -u origin master
##下拉更新
git pull
##创建分支
git branch dev
##切换分支
git checkout dev
##删除分支
 git branch -d dev
##合并某分支到当前分支
git merge <name>

Jekyll also offers powerful support for code snippets:

{% highlight ruby %}
def print_hi(name)
  puts "Hi, #{name}"
end
print_hi('Tom')
#=> prints 'Hi, Tom' to STDOUT.
{% endhighlight %}

Check out the [Jekyll docs][jekyll-docs] for more info on how to get the most out of Jekyll. File all bugs/feature requests at [Jekyll’s GitHub repo][jekyll-gh]. If you have questions, you can ask them on [Jekyll Talk][jekyll-talk].

[jekyll-docs]: https://jekyllrb.com/docs/home
[jekyll-gh]: https://github.com/jekyll/jekyll
[jekyll-talk]: https://talk.jekyllrb.com/
