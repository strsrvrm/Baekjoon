A, B, C = map(int, input().split())

print('''{}
{}
{}
{}'''.format((A + B) % C, ((A % C) + (B % C)) % C, (A * B) % C, ((A % C) * (B % C)) % C))