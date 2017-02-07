print('Compressed init file fired!')

from .gzipped import opener as gzip_opener
from .bzipped import opener as bz2_opener


__all__ = ['bz2_opener', 'gzip_opener']