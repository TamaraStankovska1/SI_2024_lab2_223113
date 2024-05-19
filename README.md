# Втора лабораториска вежба по Софтверско инженерство

## Тамара Станковска - 223113

### Control Flow Graph
![cfg](https://github.com/TamaraStankovska1/SI_2024_lab2_223113/assets/165705077/f5a13c3b-af75-4a61-b607-a2f39d7a1dcc)

### Цикломатска комплексност
Цикломатската комплексност на овој код е , истата ја добив преку формулата *E - N + 2*, каде што E е бројот на ребра, а N е бројот на јазли. Во случајoв E = 38, a N = 32, па цикломатската комплексност изнесува 8.

### Тест случаи според критериумот Every branch
![image](https://github.com/TamaraStankovska1/SI_2024_lab2_223113/assets/165705077/1e963eae-6080-4e4b-bbdb-b19704c52057)

Како што може да забележиме на сликата, за различните вредности кои ги прима функцијата (колоните), имаме различни патеки(редици) кои што се извршуваат кога функцијата ги прими тие вредности. Во последната колона Sum, е сумата од сите редови, доколку некоја патека не е опфатена сумата би била 0. Вака може лесно да забележиме дека сите патеките ни се опфатени со зададените вредности.

### Објаснување на напишаните unit tests
##### Every branch criterium
Во првата функција во тест класата имаме 5 тестови, исто колку што и колони во горенаведената табела.
Првите 3 теста ни ги проверуваат патеките во кои што се фрла исклучок со неговата точна порака.
Во другите 2 ги проверуваме преостанатите патеки и тоа дали се враќа true или false од функцијата.

##### Multiple conditions
Во оваа функција имаме 4 теста, односно кога сите услови се точни (Т, Т, Т), кога првиот е неточен (F, T, T), кога вториот е неточен(T, F, T) и кога третиот е неточен (Т, Т, F);
Во зависност од тоа каков price и discount праќаме, проверуваме дали функцијата ни враќа true или false. Со ова може да провериме дали сме влегле во if клаузулата или не.
