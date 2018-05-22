/**
 *Logback学习包.
 * 
 * --log4j与logback简要比较
 * 1.用logback替代log4j作为Spring MVC项目的日志处理组件。这两者虽然作者相同，但log4j早已被托管给Apache基金会维护，并且自从2012年5月之后就没有更新了。
 * 而logback从出生开始就是其作者奔着取代log4j的目的开发的，因此一方面logback继承了log4j大量的用法，使得学习和迁移的成本不高，
 * 2.另一方面logback在性能上要明显优于log4j，尤其是在大量并发的环境下，并且新增了一些log4j所没有的功能（如将日志文件压缩成zip包等）
 *
 * 
 * @author zj
 *
 */
package com.sgang.learning.logback;