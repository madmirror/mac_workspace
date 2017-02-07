#!/usr/bin/env python3
"""Retrieve and print words from a URL

Usage:

	python words.py <URL>
"""
import sys
from urllib.request import urlopen

def fetch_words(url):
	"""Fetch a list of from URL

	Args:
		url: The URL of a UTF-8 text document,

	Returns:
		a list of words
	"""
	with urlopen(url) as story:
		story_words = []
		for line in story:
			line_words = line.decode('utf-8').split()
			for word in line_words:
				story_words.append(word)
	return story_words


def print_items(items):
	for item in items:
		print(item)


def main(url):
	print('Fetching from ', url)
	print_items(fetch_words(url))
	print('Main Fn')


if __name__ == '__main__':
	main(sys.argv[1])
