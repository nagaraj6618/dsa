# ⭐ Pattern Programs with Java, C++, and Python Code (n = 6)

## 1. Square Star Pattern
### Example Output:
```
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int j=0;j<N;j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int j=0;j<N;j++) {
        cout << "* ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(N):
        print("*", end=" ")
    print()
```

## 2. Left-Aligned Triangle
### Example Output:
```
*
* *
* * *
* * * *
* * * * *
* * * * * *
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int j=0;j<=i;j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int j=0;j<=i;j++) {
        cout << "* ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i + 1):
        print("*", end=" ")
    print()
```

## 3. Number Triangle (Increasing)
### Example Output:
```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int j=0;j<=i;j++) {
        System.out.print(j+1 + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int j=0;j<=i;j++) {
        cout << j+1 << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i + 1):
        print(j + 1, end=" ")
    print()
```

## 4. Number Triangle (Repeating Row Number)
### Example Output:
```
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int j=0;j<=i;j++) {
        System.out.print((i+1) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int j=0;j<=i;j++) {
        cout << i+1 << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i + 1):
        print(i + 1, end=" ")
    print()
```

## 5. Inverted Left-Aligned Triangle
### Example Output:
```
* * * * * *
* * * * *
* * * *
* * *
* *
*
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int j=N;j>i;j--) {
        System.out.print("* ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int j=N;j>i;j--) {
        cout << "* ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(N - i):
        print("*", end=" ")
    print()
```

## 6. Inverted Number Triangle
### Example Output:
```
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int j=N;j>i;j--) {
        System.out.print(N - j + 1 + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int j=N;j>i;j--) {
        cout << N - j + 1 << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(N - i):
        print(j + 1, end=" ")
    print()
```

## 7. Centered Pyramid
### Example Output:
```
     *
    ***
   *****
  *******
 *********
***********
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int k=0;k<N-1-i;k++) System.out.print(" ");
    for(int j=0;j<(i*2)+1;j++) System.out.print("*");
    for(int k=0;k<N-1-i;k++) System.out.print(" ");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int k=0;k<N-1-i;k++) cout << " ";
    for(int j=0;j<(i*2)+1;j++) cout << "*";
    for(int k=0;k<N-1-i;k++) cout << " ";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print(" " * (N - i - 1) + "*" * (2 * i + 1) + " " * (N - i - 1))
```

## 8. Inverted Centered Pyramid
### Example Output:
```
***********
 *********
  *******
   *****
    ***
     *
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int k=0;k<i;k++) System.out.print(" ");
    for(int j=0;j<((N-i)*2)-1;j++) System.out.print("*");
    for(int k=0;k<i;k++) System.out.print(" ");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int k=0;k<i;k++) cout << " ";
    for(int j=0;j<((N-i)*2)-1;j++) cout << "*";
    for(int k=0;k<i;k++) cout << " ";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print(" " * i + "*" * (2 * (N - i) - 1) + " " * i)
```

## 9. Diamond Pattern
### Example Output:
```
     *
    ***
   *****
  *******
 *********
***********
***********
 *********
  *******
   *****
    ***
     *
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int k=0;k<N-i-1;k++) System.out.print(" ");
    for(int j=0;j<((i+1)*2)-1;j++) System.out.print("*");
    System.out.println();
}
for(int i=0;i<N-1;i++) {
    for(int k=0;k<i+1;k++) System.out.print(" ");
    for(int j=0;j<((N-i-1)*2)-1;j++) System.out.print("*");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int k=0;k<N-i-1;k++) cout << " ";
    for(int j=0;j<((i+1)*2)-1;j++) cout << "*";
    cout << endl;
}
for(int i=0;i<N-1;i++) {
    for(int k=0;k<i+1;k++) cout << " ";
    for(int j=0;j<((N-i-1)*2)-1;j++) cout << "*";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print(" " * (N - i - 1) + "*" * (2 * i + 1))
for i in range(N - 1):
    print(" " * (i + 1) + "*" * (2 * (N - i - 1) - 1))
```

## 10. Double-Sided Triangle
### Example Output:
```
*
**
***
****
*****
******
*****
****
***
**
*
```
### Java Code:
```java
for(int i=0;i<2*N-1;i++) {
    int star = i;
    if(i>=N) star = 2*N-i-2;
    for(int j=0;j<=star;j++) System.out.print("*");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<2*N-1;i++) {
    int star = i;
    if(i>=N) star = 2*N-i-2;
    for(int j=0;j<=star;j++) cout << "*";
    cout << endl;
}
```
### Python Code:
```python
for i in range(2 * N - 1):
    star = i if i < N else 2 * N - i - 2
    print("*" * (star + 1))
```

## 11. Binary Triangle
### Example Output:
```
1
01
101
0101
10101
010101
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    int type = i;
    for(int j=0;j<=i;j++) {
        System.out.print((type+1)%2);
        type++;
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    int type = i;
    for(int j=0;j<=i;j++) {
        cout << (type+1)%2;
        type++;
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    val = i
    for j in range(i + 1):
        print((val + 1) % 2, end="")
        val += 1
    print()
```

## 4. Number Triangle (Repeating Row Number)
### Example Output:
```
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int j=0;j<=i;j++) {
        System.out.print((i+1) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int j=0;j<=i;j++) {
        cout << (i+1) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i + 1):
        print(i + 1, end=" ")
    print()
```

## 5. Inverted Left-Aligned Triangle
### Example Output:
```
* * * * * *
* * * * *
* * * *
* * *
* *
*
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int j=N;j>i;j--) {
        System.out.print("* ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int j=N;j>i;j--) {
        cout << "* ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(N - i):
        print("*", end=" ")
    print()
```

## 6. Inverted Number Triangle
### Example Output:
```
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int j=N;j>i;j--) {
        System.out.print((N-j+1) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int j=N;j>i;j--) {
        cout << (N-j+1) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(N - i):
        print(j + 1, end=" ")
    print()
```

## 7. Centered Pyramid
### Example Output:
```
     *
    ***
   *****
  *******
 *********
***********
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int k=0;k<N-i-1;k++) System.out.print(" ");
    for(int j=0;j<(i*2)+1;j++) System.out.print("*");
    for(int k=0;k<N-i-1;k++) System.out.print(" ");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int k=0;k<N-i-1;k++) cout << " ";
    for(int j=0;j<(i*2)+1;j++) cout << "*";
    for(int k=0;k<N-i-1;k++) cout << " ";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print(" " * (N - i - 1) + "*" * (2 * i + 1) + " " * (N - i - 1))
```

## 8. Inverted Centered Pyramid
### Example Output:
```
***********
 *********
  *******
   *****
    ***
     *
```
### Java Code:
```java
for(int i=0;i<N;i++) {
    for(int k=0;k<i;k++) System.out.print(" ");
    for(int j=0;j<((N-i)*2)-1;j++) System.out.print("*");
    for(int k=0;k<i;k++) System.out.print(" ");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++) {
    for(int k=0;k<i;k++) cout << " ";
    for(int j=0;j<((N-i)*2)-1;j++) cout << "*";
    for(int k=0;k<i;k++) cout << " ";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print(" " * i + "*" * (2 * (N - i) - 1) + " " * i)
```

## 9. Diamond Pattern
### Example Output:
```
     *
    ***
   *****
  *******
 *********
***********
***********
 *********
  *******
   *****
    ***
     *
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int k=0;k<N-i-1;k++) System.out.print(" ");
    for(int j=0;j<((i+1)*2)-1;j++) System.out.print("*");
    System.out.println();
}
for(int i=0;i<N-1;i++){
    for(int k=0;k<i+1;k++) System.out.print(" ");
    for(int j=0;j<((N-i-1)*2)-1;j++) System.out.print("*");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int k=0;k<N-i-1;k++) cout << " ";
    for(int j=0;j<((i+1)*2)-1;j++) cout << "*";
    cout << endl;
}
for(int i=0;i<N-1;i++){
    for(int k=0;k<i+1;k++) cout << " ";
    for(int j=0;j<((N-i-1)*2)-1;j++) cout << "*";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print(" " * (N - i - 1) + "*" * (2 * i + 1))
for i in range(N - 1):
    print(" " * (i + 1) + "*" * (2 * (N - i - 2) + 1))
```

## 10. Double-Sided Triangle
### Example Output:
```
*
**
***
****
*****
******
*****
****
***
**
*
```
### Java Code:
```java
for(int i=0;i<2*N-1;i++){
    int star = i;
    if(i>=N) star = 2*N-i-2;
    for(int j=0;j<=star;j++) {
        System.out.print("*");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<2*N-1;i++){
    int star = i;
    if(i>=N) star = 2*N-i-2;
    for(int j=0;j<=star;j++) {
        cout << "*";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(2 * N - 1):
    star = i if i < N else 2 * N - i - 2
    for j in range(star + 1):
        print("*", end="")
    print()
```

## 11. Binary Triangle
### Example Output:
```
1
01
101
0101
10101
010101
```
### Java Code:
```java
for(int i=0;i<N;i++){
    int type = i;
    for(int j=0;j<=i;j++){
        System.out.print((type+1)%2);
        type++;
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    int type = i;
    for(int j=0;j<=i;j++){
        cout << (type+1)%2;
        type++;
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    val = i
    for j in range(i + 1):
        print((val + 1) % 2, end="")
        val += 1
    print()
```

## 12. Number Hourglass
### Example Output:
```
1          1
12        21
123      321
1234    4321
12345  54321
123456654321
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print(j+1);
    for(int k=0;k<(N-i)*2-2;k++) System.out.print(" ");
    for(int j=0;j<=i;j++) System.out.print(i-j+1);
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) cout << j+1;
    for(int k=0;k<(N-i)*2-2;k++) cout << " ";
    for(int j=0;j<=i;j++) cout << i-j+1;
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print("".join(str(j+1) for j in range(i+1)) + " " * ((N-i)*2-2) + "".join(str(i-j+1) for j in range(i+1)))
```

## 13. Continuous Number Triangle
### Example Output:
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
```
### Java Code:
```java
int num=1;
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        System.out.print(num++ + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
int num=1;
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        cout << num++ << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
num = 1
for i in range(N):
    for j in range(i+1):
        print(num, end=" ")
        num += 1
    print()
```

## 14. Alphabet Triangle
### Example Output:
```
A
A B
A B C
A B C D
A B C D E
A B C D E F
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        System.out.print((char)(64+j+1) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        cout << (char)(64+j+1) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i+1):
        print(chr(65+j), end=" ")
    print()
```

## 15. Inverted Alphabet Triangle
### Example Output:
```
A B C D E F
A B C D E
A B C D
A B C
A B
A
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++){
        System.out.print((char)(64+j+1) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++){
        cout << (char)(64+j+1) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(N-i):
        print(chr(65+j), end=" ")
    print()
```

## 16. Repeating Alphabet Row
### Example Output:
```
A
B B
C C C
D D D D
E E E E E
F F F F F F
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        System.out.print((char)(64+i+1) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        cout << (char)(64+i+1) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i+1):
        print(chr(65+i), end=" ")
    print()
```

## 17. Palindromic Alphabet Pyramid
### Example Output:
```
   A
  ABA
 ABCBA
ABCDCBA
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int k=0;k<N-i-1;k++) System.out.print(" ");
    for(int j=0;j<=i;j++) System.out.print((char)(64+j+1));
    for(int j=0;j<i;j++) System.out.print((char)(64+i-j));
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int k=0;k<N-i-1;k++) cout << " ";
    for(int j=0;j<=i;j++) cout << (char)(64+j+1);
    for(int j=0;j<i;j++) cout << (char)(64+i-j);
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print(" "*(N-i-1) + "".join(chr(65+j) for j in range(i+1)) + "".join(chr(64+i-j) for j in range(i)))
```

## 18. Reverse Starting Alphabet Triangle
### Example Output:
```
E
D E
C D E
B C D E
A B C D E
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        System.out.print((char)(64+N-i+j) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        cout << (char)(64+N-i+j) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i+1):
        print(chr(64+N-i+j), end=" ")
    print()
```

## 19. Hollow Hourglass
### Example Output:
```
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++) System.out.print("*");
    for(int k=0;k<2*i;k++) System.out.print(" ");
    for(int j=0;j<N-i;j++) System.out.print("*");
    System.out.println();
}
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print("*");
    for(int k=0;k<2*(N-i)-2;k++) System.out.print(" ");
    for(int j=0;j<=i;j++) System.out.print("*");
    System.out.println();
}
```
### C++ Code:
```cpp
// same as Java structure with cout and endl
```
### Python Code:
```python
for i in range(N):
    print("*" * (N - i) + " " * (2 * i) + "*" * (N - i))
for i in range(N):
    print("*" * (i + 1) + " " * (2 * (N - i - 1)) + "*" * (i + 1))
```

## 20. Butterfly Pattern
### Example Output:
```
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print("*");
    for(int k=0;k<2*(N-i)-2;k++) System.out.print(" ");
    for(int j=0;j<=i;j++) System.out.print("*");
    System.out.println();
}
for(int i=0;i<N-1;i++){
    for(int j=0;j<N-i-1;j++) System.out.print("*");
    for(int k=0;k<2*i+2;k++) System.out.print(" ");
    for(int j=0;j<N-i-1;j++) System.out.print("*");
    System.out.println();
}
```
### C++ Code:
```cpp
// Similar to Java with cout
```
### Python Code:
```python
for i in range(N):
    print("*"*(i+1) + " "*(2*(N-i-1)) + "*"*(i+1))
for i in range(N-1):
    print("*"*(N-i-1) + " "*(2*(i+1)) + "*"*(N-i-1))
```

## 21. Hollow Square
### Example Output:
```
******
*    *
*    *
*    *
*    *
******
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<N;j++){
        if(i==0 || j==0 || j==N-1 || i==N-1)
            System.out.print("*");
        else System.out.print(" ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
// Same as Java with cout
```
### Python Code:
```python
for i in range(N):
    for j in range(N):
        if i==0 or j==0 or i==N-1 or j==N-1:
            print("*", end="")
        else:
            print(" ", end="")
    print()
```

## 22. Number Spiral Matrix
### Example Output:
```
6 6 6 6 6 6 6 6 6 6 6
6 5 5 5 5 5 5 5 5 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 2 1 2 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 5 5 5 5 5 5 5 5 6
6 6 6 6 6 6 6 6 6 6 6
```
### Java Code:
```java
for(int i=0;i<(2*N)-1;i++){
    for(int j=0;j<(2*N)-1;j++){
        int top = i, bottom = 2*N-2-i;
        int left = j, right = 2*N-2-j;
        System.out.print(N - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
// Same logic with cout
```
### Python Code:
```python
size = 2 * N - 1
for i in range(size):
    for j in range(size):
        print(N - min(i, j, size - 1 - i, size - 1 - j), end=" ")
    print()
```

## 12. Number Hourglass
### Example Output:
```
1          1
12        21
123      321
1234    4321
12345  54321
123456654321
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print(j+1);
    for(int k=0;k<(N-i-1)*2;k++) System.out.print(" ");
    for(int j=i;j>=0;j--) System.out.print(j+1);
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) cout << j+1;
    for(int k=0;k<(N-i-1)*2;k++) cout << " ";
    for(int j=i;j>=0;j--) cout << j+1;
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print("".join(str(j+1) for j in range(i+1)) + " " * ((N-i-1)*2) + "".join(str(j+1) for j in reversed(range(i+1))))
```

## 13. Continuous Number Triangle
### Example Output:
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
```
### Java Code:
```java
int num = 1;
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print(num++ + " ");
    System.out.println();
}
```
### C++ Code:
```cpp
int num = 1;
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) cout << num++ << " ";
    cout << endl;
}
```
### Python Code:
```python
num = 1
for i in range(N):
    for j in range(i+1):
        print(num, end=" ")
        num += 1
    print()
```

## 14. Alphabet Triangle
### Example Output:
```
A
A B
A B C
A B C D
A B C D E
A B C D E F
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print((char)(65+j) + " ");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) cout << (char)(65+j) << " ";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i+1):
        print(chr(65+j), end=" ")
    print()
```

## 15. Inverted Alphabet Triangle
### Example Output:
```
A B C D E F
A B C D E
A B C D
A B C
A B
A
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++) System.out.print((char)(65+j) + " ");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++) cout << (char)(65+j) << " ";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(N-i):
        print(chr(65+j), end=" ")
    print()
```

## 16. Repeating Alphabet Row
### Example Output:
```
A
B B
C C C
D D D D
E E E E E
F F F F F F
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print((char)(65+i) + " ");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) cout << (char)(65+i) << " ";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i+1):
        print(chr(65+i), end=" ")
    print()
```

## 17. Palindromic Alphabet Pyramid
### Example Output:
```
   A
  ABA
 ABCBA
ABCDCBA
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int k=0;k<N-i-1;k++) System.out.print(" ");
    for(int j=0;j<=i;j++) System.out.print((char)(65+j));
    for(int j=i-1;j>=0;j--) System.out.print((char)(65+j));
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int k=0;k<N-i-1;k++) cout << " ";
    for(int j=0;j<=i;j++) cout << (char)(65+j);
    for(int j=i-1;j>=0;j--) cout << (char)(65+j);
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print(" "*(N-i-1) + "".join(chr(65+j) for j in range(i+1)) + "".join(chr(65+j) for j in range(i-1, -1, -1)))
```

## 18. Reverse Starting Alphabet Triangle
### Example Output:
```
E
D E
C D E
B C D E
A B C D E
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print((char)(65+N-i-1+j) + " ");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) cout << (char)(65+N-i-1+j) << " ";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i+1):
        print(chr(65+N-i-1+j), end=" ")
    print()
```

## 19. Hollow Hourglass
### Example Output:
```
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++) System.out.print("*");
    for(int k=0;k<2*i;k++) System.out.print(" ");
    for(int j=0;j<N-i;j++) System.out.print("*");
    System.out.println();
}
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print("*");
    for(int k=0;k<2*(N-i-1);k++) System.out.print(" ");
    for(int j=0;j<=i;j++) System.out.print("*");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++) cout << "*";
    for(int k=0;k<2*i;k++) cout << " ";
    for(int j=0;j<N-i;j++) cout << "*";
    cout << endl;
}
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) cout << "*";
    for(int k=0;k<2*(N-i-1);k++) cout << " ";
    for(int j=0;j<=i;j++) cout << "*";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print("*"*(N-i) + " "*(2*i) + "*"*(N-i))
for i in range(N):
    print("*"*(i+1) + " "*(2*(N-i-1)) + "*"*(i+1))
```

## 20. Butterfly Pattern
### Example Output:
```
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print("*");
    for(int k=0;k<2*(N-i-1);k++) System.out.print(" ");
    for(int j=0;j<=i;j++) System.out.print("*");
    System.out.println();
}
for(int i=0;i<N-1;i++){
    for(int j=0;j<N-i-1;j++) System.out.print("*");
    for(int k=0;k<2*(i+1);k++) System.out.print(" ");
    for(int j=0;j<N-i-1;j++) System.out.print("*");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) cout << "*";
    for(int k=0;k<2*(N-i-1);k++) cout << " ";
    for(int j=0;j<=i;j++) cout << "*";
    cout << endl;
}
for(int i=0;i<N-1;i++){
    for(int j=0;j<N-i-1;j++) cout << "*";
    for(int k=0;k<2*(i+1);k++) cout << " ";
    for(int j=0;j<N-i-1;j++) cout << "*";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print("*"*(i+1) + " "*(2*(N-i-1)) + "*"*(i+1))
for i in range(N-1):
    print("*"*(N-i-1) + " "*(2*(i+1)) + "*"*(N-i-1))
```

## 21. Hollow Square
### Example Output:
```
******
*    *
*    *
*    *
*    *
******
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<N;j++){
        if(i==0 || i==N-1 || j==0 || j==N-1) System.out.print("*");
        else System.out.print(" ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<N;j++){
        if(i==0 || i==N-1 || j==0 || j==N-1) cout << "*";
        else cout << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(N):
        if i==0 or i==N-1 or j==0 or j==N-1:
            print("*", end="")
        else:
            print(" ", end="")
    print()
```

## 22. Number Spiral Matrix
### Example Output:
```
6 6 6 6 6 6 6 6 6 6 6
6 5 5 5 5 5 5 5 5 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 2 1 2 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 5 5 5 5 5 5 5 5 6
6 6 6 6 6 6 6 6 6 6 6
```
### Java Code:
```java
for(int i=0;i<2*N-1;i++){
    for(int j=0;j<2*N-1;j++){
        int min = Math.min(Math.min(i, j), Math.min((2*N-2-i), (2*N-2-j)));
        System.out.print((N-min) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<2*N-1;i++){
    for(int j=0;j<2*N-1;j++){
        int min = min(min(i, j), min((2*N-2-i), (2*N-2-j)));
        cout << (N-min) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(2*N-1):
    for j in range(2*N-1):
        print(N - min(i, j, 2*N-2-i, 2*N-2-j), end=" ")
    print()
```

## 12. Number Hourglass
### Example Output:
```
1          1
12        21
123      321
1234    4321
12345  54321
123456654321
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        System.out.print(j+1);
    }
    for(int k=0;k<(N-i)*2-2;k++){
        System.out.print(" ");
    }
    for(int j=0;j<=i;j++){
        System.out.print(i-j+1);
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        cout << j+1;
    }
    for(int k=0;k<(N-i)*2-2;k++){
        cout << " ";
    }
    for(int j=0;j<=i;j++){
        cout << i-j+1;
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print("".join(str(j+1) for j in range(i+1)) + " " * ((N - i - 1) * 2) + "".join(str(i - j + 1) for j in range(i + 1)))
```

## 13. Continuous Number Triangle
### Example Output:
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
```
### Java Code:
```java
int num = 1;
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        System.out.print(num++ + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
int num = 1;
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        cout << num++ << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
num = 1
for i in range(N):
    for j in range(i + 1):
        print(num, end=" ")
        num += 1
    print()
```

## 14. Alphabet Triangle
### Example Output:
```
A
A B
A B C
A B C D
A B C D E
A B C D E F
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        System.out.print((char)(64+j+1) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        cout << (char)(64+j+1) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i + 1):
        print(chr(65 + j), end=" ")
    print()
```

## 15. Inverted Alphabet Triangle
### Example Output:
```
A B C D E F
A B C D E
A B C D
A B C
A B
A
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++){
        System.out.print((char)(64+j+1) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++){
        cout << (char)(64+j+1) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(N - i):
        print(chr(65 + j), end=" ")
    print()
```

## 16. Repeating Alphabet Row
### Example Output:
```
A
B B
C C C
D D D D
E E E E E
F F F F F F
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        System.out.print((char)(64+i+1) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        cout << (char)(64+i+1) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i + 1):
        print(chr(65 + i), end=" ")
    print()
```

## 17. Palindromic Alphabet Pyramid
### Example Output:
```
   A
  ABA
 ABCBA
ABCDCBA
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int k=0;k<N-i-1;k++) System.out.print(" ");
    for(int j=0;j<=i;j++) System.out.print((char)(64+j+1));
    for(int j=0;j<i;j++) System.out.print((char)(64+i-j));
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int k=0;k<N-i-1;k++) cout << " ";
    for(int j=0;j<=i;j++) cout << (char)(64+j+1);
    for(int j=0;j<i;j++) cout << (char)(64+i-j);
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print(" " * (N - i - 1) + "".join(chr(65 + j) for j in range(i + 1)) + "".join(chr(64 + i - j) for j in range(i)))
```

## 18. Reverse Starting Alphabet Triangle
### Example Output:
```
E
D E
C D E
B C D E
A B C D E
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        System.out.print((char)(64+N-i+j) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++){
        cout << (char)(64+N-i+j) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(i + 1):
        print(chr(65 + N - i - 1 + j), end=" ")
    print()
```

## 19. Hollow Hourglass
### Example Output:
```
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++) System.out.print("*");
    for(int k=0;k<2*i;k++) System.out.print(" ");
    for(int j=0;j<N-i;j++) System.out.print("*");
    System.out.println();
}
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print("*");
    for(int k=0;k<2*(N-i)-2;k++) System.out.print(" ");
    for(int j=0;j<=i;j++) System.out.print("*");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<N-i;j++) cout << "*";
    for(int k=0;k<2*i;k++) cout << " ";
    for(int j=0;j<N-i;j++) cout << "*";
    cout << endl;
}
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) cout << "*";
    for(int k=0;k<2*(N-i)-2;k++) cout << " ";
    for(int j=0;j<=i;j++) cout << "*";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print("*" * (N - i) + " " * (2 * i) + "*" * (N - i))
for i in range(N):
    print("*" * (i + 1) + " " * (2 * (N - i - 1)) + "*" * (i + 1))
```

## 20. Butterfly Pattern
### Example Output:
```
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) System.out.print("*");
    for(int k=0;k<2*(N-i)-2;k++) System.out.print(" ");
    for(int j=0;j<=i;j++) System.out.print("*");
    System.out.println();
}
for(int i=0;i<N-1;i++){
    for(int j=0;j<N-i-1;j++) System.out.print("*");
    for(int k=0;k<2*i+2;k++) System.out.print(" ");
    for(int j=0;j<N-i-1;j++) System.out.print("*");
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<=i;j++) cout << "*";
    for(int k=0;k<2*(N-i)-2;k++) cout << " ";
    for(int j=0;j<=i;j++) cout << "*";
    cout << endl;
}
for(int i=0;i<N-1;i++){
    for(int j=0;j<N-i-1;j++) cout << "*";
    for(int k=0;k<2*i+2;k++) cout << " ";
    for(int j=0;j<N-i-1;j++) cout << "*";
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    print("*" * (i + 1) + " " * (2 * (N - i - 1)) + "*" * (i + 1))
for i in range(N - 1):
    print("*" * (N - i - 1) + " " * (2 * (i + 1)) + "*" * (N - i - 1))
```

## 21. Hollow Square
### Example Output:
```
******
*    *
*    *
*    *
*    *
******
```
### Java Code:
```java
for(int i=0;i<N;i++){
    for(int j=0;j<N;j++){
        if(i==0 || j==0 || i==N-1 || j==N-1) System.out.print("*");
        else System.out.print(" ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<N;i++){
    for(int j=0;j<N;j++){
        if(i==0 || j==0 || i==N-1 || j==N-1) cout << "*";
        else cout << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(N):
    for j in range(N):
        if i == 0 or j == 0 or i == N - 1 or j == N - 1:
            print("*", end="")
        else:
            print(" ", end="")
    print()
```

## 22. Number Spiral Matrix
### Example Output:
```
6 6 6 6 6 6 6 6 6 6 6
6 5 5 5 5 5 5 5 5 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 2 1 2 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 5 5 5 5 5 5 5 5 6
6 6 6 6 6 6 6 6 6 6 6
```
### Java Code:
```java
for(int i=0;i<(2*N-1);i++){
    for(int j=0;j<(2*N-1);j++){
        int top = i;
        int bottom = (2*N)-2-i;
        int left = j;
        int right = (2*N)-2-j;
        System.out.print(N - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
    }
    System.out.println();
}
```
### C++ Code:
```cpp
for(int i=0;i<(2*N-1);i++){
    for(int j=0;j<(2*N-1);j++){
        int top = i;
        int bottom = (2*N)-2-i;
        int left = j;
        int right = (2*N)-2-j;
        cout << N - min(min(top, bottom), min(left, right)) << " ";
    }
    cout << endl;
}
```
### Python Code:
```python
for i in range(2 * N - 1):
    for j in range(2 * N - 1):
        top = i
        bottom = 2 * N - 2 - i
        left = j
        right = 2 * N - 2 - j
        print(N - min(top, bottom, left, right), end=" ")
    print()
```

