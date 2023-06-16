### Resume section 19 Behaviour Driven Development

### BDD
BDD Merupakan proses software development yang menerapkan penulisan test case sebelum developer menuliskan pre-reaction codenya.
Proses TDD sendiri berfokus pada komponen-komponen dalam sistem dan test case ditulis dalam berbahasa pemrograman, serupa dengan TDD, BDD juga menerapkan konsep Test First, namun dengan fokus yang berbeda.

#### Dalam BDD Test Tim Developer 
akan menuliskan berbagai skenario yang menjelaskan behaviour sistem dari perspektif pengguna. Skenario yang digunakan dengan format bahasa yang mudah dipahami oleh stackholder dalam pengembangan sistem.

#### BDD memiliki tujuan utama 
untuk meningkatkan komunikasi dan kolaborasi antara seluruh stackholder tim bisnis maupun teknikal yang terlibat dalam pengembangan sistem. Hal ini dapat membantu memastikan bahwa fitur - fitur dalam sistem dapat dipahami dengan baik oleh seluruh tim. Komunikasi yang baik dapat menyatukan stackholderyang berbeda-beda dalam suatu pemahaman dan ekspektasi yang sama serta fitur-fitur dalam sistem dapat memenuhi kebutuhan pengguna dan menghasilkan bisnis value.

#### Prinsip dasar dari BDD adalah mendeskripsikan behaviour dari sebuah sistem tanpa melibatkan penjelasan implementasinya secara rinci.
Terdapat pemisahan antara keduanya dalam pendekatan stackholder teknikal maupun non teknikal saling berkolaborasi untuk mendeskripsikan kebutuhan pengguna dan kebutuhan functional sistem yang dituliskan melalui feature file. Deskripsi yang dalam dalam feature file berperan sebagai test logic, kemudian akan menjadi dasar bagi quality assurance.
Dalam menuliskan test script dalam menuliskan implementasi dan dasar bagi developer untuk menuliskan dasar codenya untuk menjangkau sistem.

#### features file dalam BDD dituliskan dalam bahasa gerkin dalam format berbahasa inggris yang mudah dipahami oleh siapapun.
Secara mendasar terdapat 3 tahapan untuk melakukan tet BDD :
1. Menentukan user story nya untuk menjelaskan kebutuhan pengguna dan functionalitas sistem yang diharapkan.
2. Menuliskan scenario features file dengan menggunakan gerki syntax berdasarkan user storynya.
3. Mengimplementasikan test script dalam setiap file berdasarkan scenario. Contoh : As a [x], i want [y], so that [z].
Terdapat 3 keyword sebagai elemen utama dalam skenario BDD: 
- Given : Menjelaskan konteks dari skenario
- When : Menjelaskan tindakan yang dilakukan oleh user 
- Then : Menjelaskan offcom yang dilakukan oleh user.

### Cucumber
Cucumber adalah sebuah tools yang mendukung BDD. Cucumber membaca semacam ketentuan yang dapat dieksekusi dimana ditulis menggunakan teks biasa dan ketentuan memvalidasi sistem atau aplikasi melakukan apa yang dituliskan dalam ketentuan tersebut. 
Ketentuan tersebut terdiri dari beberapa skenario



