#!/usr/bin/env python
# Author: yong
# Created: Mon Jul 25 00:02:49 EDT 2016

print("hello files")

with open('scores.txt') as fil:
	for text in fil.readline():
		print(text)
