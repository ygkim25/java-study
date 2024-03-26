import random
print('Welcome To Password Generator')

chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@$%^&*().,?0123456789'

num = int(input('비밀번호 갯수 : '))
len = int(input('비밀번호 자릿 수 : '))

print('\n--Here are your passwords--')

pw=""
  # 여기에 for문 작성
for i in range(1,num+1):
    for j in range(1,len+1):
        pw =pw + chars[random.randrange(1,len(chars))]
    print(pw)
    pw=""
