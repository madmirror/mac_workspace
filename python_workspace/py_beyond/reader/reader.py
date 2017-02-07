#!/usr/bin/env python3
# Author: yong

import os
from .compressed import gzipped, bzipped

extension_map = {
	'.bz2': bzipped.opener,
	'.gz': bzipped.opener,
}

class Reader:
	def __init__(self, filename):
		extension = os.path.splitext(filename)[1]
		opener = extension_map.get(extension, open)
		self.filename = filename
		self.f = opener(self.filename, 'rt')

	def close(self):
		self.f.close()

	def read(self):
		return self.f.read()
