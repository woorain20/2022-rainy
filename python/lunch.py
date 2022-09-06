# import fast as f - as는 안 붙여도 됨
# from fast import pick
# - 폴더 안에 import할 파일이 있는 경우 아래 처럼
from sources import fast

# pick만 불러올 경우 f.pick에서 f를 빼도 됨
# from fast import pick as p - pick() 이름도 변경 가능

place=fast.pick()
print("Let's go to ",place)