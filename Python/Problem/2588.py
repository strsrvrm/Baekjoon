A = int(input())
B = int(input())
C = A * (B % 10)
D = A * ((B % 100) // 10)
E = A * (B // 100)
F = C + (D * 10) + (E * 100)

print('''{}
{}
{}
{}'''.format(C, D, E, F))