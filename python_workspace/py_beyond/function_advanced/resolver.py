import socket

class Resolver:

	def __init__(self):
		self._cache = {}

	def __call__(self, hostname):
		if not hostname in self._cache:
			self._cache[hostname] = socket.gethostbyname(hostname)
		return self._cache[hostname]

	def has_host(self, hostname):
		return hostname in self._cache

	def clear(self):
		self._cache.clear()
