#!/usr/bin/env python3

import sys

def printPipe(name):
	print(name, "  --in python")
	sys.stdout.write(name + '\n')

if __name__=='__main__':
	for name in sys.stdin.readlines():
		printPipe(name)
