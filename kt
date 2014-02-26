# coding: latin-1
import os
clear = os.system('clear');
#1
#1) kontrollida, kas teksti sisaldab 'a' ja 'b' või 'c' ja 'd'.
text = raw_input('Siesesta tekst: ')
if ('a' in text and 'b' in text) or ('c' in text and 'd' in text):
print 'Tekstis on kas a ja b või c ja d'
else:
print 'Tekstis pole kas a ja b või c ja d'
#2
a = raw_input('Täisarv ')
if int(a) <= 1000 and 0 <= int(a): # viga on selles et and asemel oli or ja oli vaja täisarvuks teisendada
print 'ok'
#3
arvutus = -(2 * 1) * 3 ** 2 / 4 * (1 + 1.0)
print '-2 * -1 * 3 ** 2 / 4 * (1 + 1.0)'
print '2 * 3 ** 2 / 4 * (1 + 1.0)'
print '6 ** 2 / 4 * (1 + 1.0)'
print '36 / 4 * (1 + 1.0)'
print '9 * (1 + 1.0)'
print '9 * 2.0'
print '18.0'
print 'vastus: ', -(2 * 1) * 3 ** 2 / 4 * (1 + 1.0)
#4
print ">>> int(1)+int(1), int(1)+float(1), float(1)+int(1), float(1)+float(1)"
print "(2, 2.0, 2.0, 2.0)"
#5
a = ‘asdfkjsadjflksadflkasdlfklasjdlkjfas’ #annab a'le tekstilise väärtuse
z1 = len(a) > 5 #z1 väärtus on boolean mis on tõene kui a pikkus on suurem kui 5
z2 = ‘q’ in a or ‘z’ in a #z2 väärtus n boolean mis on tõene kui q täht on a's või z tät on a's
if z1 and not z2: # kui z1 ja z2 on mõlemad negatiivsed teostatakse järgnev rida
print “ok” #ilmutatakse ok 
