#!/bin/zsh
for i ({1..900}) {
    DIR_NAME=`printf "_%03d" $i`
    if [ ! -d $DIR_NAME ] ; then
	mkdir $DIR_NAME && echo "package com.fibers.algorithm.leetcode.$DIR_NAME;\r\npublic class Solution {\r\n}\r\n" > $DIR_NAME/Solution.java
    fi
}
