---
layout: post
title:  "Welcome to Jekyll!"
date:   2018-08-02 23:08:22 +0800
categories: jekyll update
---


## Git连接自己的远程库指令步骤

```
git init//初始化git仓库环境
git remote add origin git@github.com:ForSomeH/ForSomeH.github.io.git//建立远程库连接
ssh-keygen -t rsa -C "512964300@qq.com"//生成公钥和私钥
将公钥添加到github个人账户信任列表种
git config --global user.name //注册用户名
git config --global user.email //注册用户邮箱
git clone  git@github.com:ForSomeH/ForSomeH.github.io.git//克隆内容

```



You’ll find this post in your `_posts` directory. Go ahead and edit it and re-build the site to see your changes. You can rebuild the site in many different ways, but the most common way is to run `jekyll serve`, which launches a web server and auto-regenerates your site when a file is updated.

To add new posts, simply add a file in the `_posts` directory that follows the convention `YYYY-MM-DD-name-of-post.ext` and includes the necessary front matter. Take a look at the source for this post to get an idea about how it works.

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
