# Cryptographic Algorithms Implementation 🔐

A collection of classic and modern cryptographic algorithms implemented in Java and Python. This project provides educational implementations of various encryption and decryption techniques.

## Implemented Algorithms 🛠️

### 1. Blowfish (Java)
- Symmetric block cipher
- Variable key length (32-448 bits)
- 16-round Feistel cipher
- Features:
  - Key generation
  - Encryption/Decryption
  - Block size: 64 bits

### 2. DES - Data Encryption Standard (Python)
- Symmetric key algorithm
- 56-bit key length
- 64-bit block size
- Features:
  - Initial and final permutation
  - 16 rounds of encryption
  - Key schedule generation

### 3. Hill Cipher (Java)
- Classical polygraphic substitution cipher
- Based on linear algebra
- Features:
  - Matrix operations
  - Key matrix generation
  - Modular arithmetic
  - Text-to-matrix conversion

### 4. RSA (Java)
- Public-key cryptosystem
- Asymmetric algorithm
- Features:
  - Key pair generation
  - Prime number generation
  - Message encryption/decryption
  - Digital signature support

### 5. RC4 (Java)
- Stream cipher
- Variable key length
- Features:
  - Key scheduling algorithm (KSA)
  - Pseudo-random generation algorithm (PRGA)
  - Byte-level operations

### 6. Caesar Cipher (Java)
- Classical substitution cipher
- Shift cipher implementation
- Features:
  - Customizable shift value
  - Alphabetic encryption/decryption
  - Case preservation


## Prerequisites 📋

- Java JDK 8 or higher
- Python 3.7 or higher
- IDE (recommended: IntelliJ IDEA for Java, PyCharm for Python)

## Installation and Setup 🚀

1. Clone the repository:
https://github.com/siddharthak800/Cryptography-Implementations.git


## Usage Examples 💻

### Blowfish (Java)
```java
BlowfishImpl blowfish = new BlowfishImpl("secretkey");
String plaintext = "Hello, World!";
String encrypted = blowfish.encrypt(plaintext);
String decrypted = blowfish.decrypt(encrypted);
```

### DES (Python)
```python
from des.des_implementation import DES

des = DES(key="secret_k")
encrypted = des.encrypt("Hello!")
decrypted = des.decrypt(encrypted)
```

### Hill Cipher (Java)
```java
HillCipher hill = new HillCipher(3);  // 3x3 matrix key
String encrypted = hill.encrypt("HELLO");
String decrypted = hill.decrypt(encrypted);
```

### RSA (Java)
```java
RSAImpl rsa = new RSAImpl(2048);  // 2048-bit key
String encrypted = rsa.encrypt("Secret message");
String decrypted = rsa.decrypt(encrypted);
```

### RC4 (Java)
```java
RC4Impl rc4 = new RC4Impl("key");
byte[] encrypted = rc4.encrypt("Hello, World!");
byte[] decrypted = rc4.decrypt(encrypted);
```

### Caesar Cipher (Java)
```java
CaesarCipher caesar = new CaesarCipher(3);  // shift by 3
String encrypted = caesar.encrypt("HELLO");
String decrypted = caesar.decrypt(encrypted);
```

## Testing 🧪

Each algorithm includes unit tests to verify functionality:

### Java Tests
```bash
# Run all Java tests
java org.junit.runner.JUnitCore *Test

# Run specific test
java org.junit.runner.JUnitCore BlowfishTest
```

### Python Tests
```bash
# Run DES tests
python -m pytest python/des/des_test.py
```

## Algorithm Complexity Analysis ⚡

| Algorithm    | Key Size (bits) | Block Size | Speed    | Security Level |
|-------------|----------------|------------|----------|----------------|
| Blowfish    | 32-448        | 64 bits    | Fast     | High          |
| DES         | 56            | 64 bits    | Moderate | Moderate      |
| Hill Cipher | Variable      | Variable   | Fast     | Low           |
| RSA         | 1024-4096     | Variable   | Slow     | Very High     |
| RC4         | 40-2048       | Stream     | Very Fast| Moderate      |
| Caesar      | 5 bits        | 1 char     | Very Fast| Very Low      |

## Security Considerations ⚠️

- These implementations are for educational purposes
- Some algorithms (like Caesar Cipher) are not cryptographically secure

## Documentation 📚

Each algorithm implementation includes:
- Detailed comments explaining the algorithm steps
- Method documentation
- Example usage
- Security considerations
- Time and space complexity analysis


## References 📖

- "Handbook of Applied Cryptography" by A. Menezes
- "Cryptography and Network Security" by William Stallings
- NIST Cryptographic Standards
- RFC Documents for respective algorithms

