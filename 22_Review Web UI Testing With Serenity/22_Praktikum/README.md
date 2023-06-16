### Resume section 22 Web UI Testing using Serenity with Cucumber

### Web Automation Testing
Adalah suatu cara yang digunakan untuk melakukan testing terhadap web yang dibuat.

Ada beberapa tools yang bisa kita pakai untuk membuat automation testing :
1. Katalon, tools yang digunakan untuk melakukan testing mulai dari mobile apps sampai ke broswer desktop. Tools ini dapat merekam langkah menangkap elemen web pada web aplikasi, memainkan secara otomatis untuk test case yang sudah ada dan untuk reportnya. Pada katalon kita dapat menangkap objek/elemen seperti button, filtext, radiobutton, select, dll.

2. Cypress,adalah ree test tools dimana bisa dirun pad CI dan dapat digunakan pada operating system seperti mac, linux, dan windows. Saat ini cypress hanya dapat melakukan pengerjaan testing pada web saja dan belum bisa melakukan pengerjaan pada native mobile app. Pada tools ini disupport oleh bahasa js, ruby, noted, php dll.

3. Robot Framework, menggunakan bahasa programming python. Salah satu framework dari selenium yang dapat kita comment dengan custom function dengan bahasa python. Robot framework merupakan open source tools yang digunakan untuk automation seperti web, api. 

4. Test Project, termasuk tools automation testing yang kepopulerannya bisa disejajarkan dengan katalon. Menggunakan selenium sebagai website dan apium untuk mobilenya.

Serenity BDD merupakan library open source yang membantu tester dalam menulis open source exitend test yang terstruktur dan lebih terawat baik dan menghasilkan laporan pengujian yang kaya makna yang dikenal dengan living documentations.

Arsitektur Serenity BDD :
- Requirements
- Tests
- Steps
- Pages
- Reports

Define Requirements :
Contohnya : search by keyword

Automate Acceptance Criteria :
Contoh : 
Feature : .....
Scenario :
  - Given
  - When
  - Then
  
Implement The Test :
Implementasi dari scenario pada automated acceptance criteria

Report On The Test Result :
- A narrative or each test
- Screenshoots for each step in the test
- The result including execution times and error messages if a test failed 

### BDD Framework With Cucumber

The step overview :
- Write story
- Configure stories
- Browser Interaction
- Run stories
- View Reports

Preparations :
- Maven
- Homebrew
- Chrome
- Intellij

Writing The Test :
- Serenity cucumber
- Create file stories
- Create file test class
- Create file test steps
- Create file pages objects


