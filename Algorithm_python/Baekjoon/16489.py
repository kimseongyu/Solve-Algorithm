import decimal

def main():
    a, b, c = map(int, input().split())
    a = decimal.Decimal(a)
    b = decimal.Decimal(b)
    c = decimal.Decimal(c)
    s = (a + b + c) / 2
    R = (a*a*b*b*c*c)/(16*(s-a)*(s-b)*(s-c)*s)
    R = R.sqrt()
    r = (a*b*c)/(4*s*R)
    S = s*r
    d = decimal.Decimal(max(0, R*R-2*R*r))
    d = d.sqrt()
    k = (R*R-(a/2)*(a/2)).sqrt() + (R*R-(b/2)*(b/2)).sqrt() + (R*R-(c/2)*(c/2)).sqrt()

    print(S)
    print(R)
    print(r)
    print(d)
    print(k)

if __name__ == "__main__":
    main()