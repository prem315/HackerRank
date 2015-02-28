N = int(input())
K = int(input())
my_list = []
for x in range(N):
    my_list.append(int(input()))
my_list.sort()
minimum = my_list[N-1]
for x in range(N-K):
    dif = my_list[x+K-1]-my_list[x]
    minimum = dif if minimum > dif else minimum
print(minimum)
