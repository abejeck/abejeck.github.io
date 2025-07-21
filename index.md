---
layout: default
title: Home Page
---
# Welcome!

Hello and welcome to my blog, **The Road to Genius**, which represents the idea that becoming a "Genius" is a journey that includes consistent learning, critical thinking, and working on understanding complex ideas. I've created this space as a personal hub to explore my current interests and share the knowledge I'm gaining along the way.

My primary focus areas right now include: coding fundamentals, cybersecurity and emerging trends. Join me as I try to become a genius!

## Latest Posts

{% for post in site.posts limit:5 %}
  <h3>{{ post.title }}</h3>
  <a href="{{ post.url }}">Read more</a>
{% endfor %} 

## About Me 
<p>Learn more about me on my <a href="{% link about.md %}">About Me page</a>.</p>









