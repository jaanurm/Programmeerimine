# coding: latin-1
import os
clear = os.system('clear');
#1
#1) Kontrollida, kas tekst sisaldab ('a', 'b' või 'c') ja ei sisaldu ('d' või 'e').
text = raw_input('siesesta text: ')
if ('a' in text or 'b' in text or 'c' in text) and not ('d' in text or 'e' in text):
    print 'on'
#2
a = int(raw_input('Koma-arv: '))
if (0 <=a) and (a <= 1.0): # kontrollib kas 0 <= a boolean on väiksem kui 1.0
print 'ok'
#3
arvutus = ((2 + 3) * (4 + 5.0 / 2) * (2 ** (4 - 2*2)) * - (float(1))
print '(5 * (4 + 5.0 / 2) * (2 ** (4 - 2*2)) * - (float(1))'
print '(5 * (4 + 2.5) * (2 ** (4 - 2*2)) * - (float(1))'
print '(5 * 6.5 * (2 ** (4 - 2*2)) * - (float(1))'
print '(32.5 * (2 ** (4 - 2*2)) * - (float(1))'
print '(32.5 * (2 ** (4 - 4)) * - (float(1))'
print '(32.5 * (2 ** 0) * - (float(1))'
print '(32.5 * 1 * - (float(1))'
print '(32.5 * 1 * - 1.0)'
print '(32.5*-1.0)'
print '(-32.5)'
print 'vastus: ', ((2 + 3) * (4 + 5.0 / 2) * (2 ** (4 - 2*2)) * - (float(1))
#4
print ">>> int(1)/int(1), int(1)/float(1), float(1)/int(1), float(1)/float(1)"
print ">>> int(1)*int(1), int(1)*float(1), float(1)*int(1), float(1)*float(1)"
print "(1, 1.0, 1.0, 1.0)"
#5
a = raw_input(‘Text:’)#kasutaja sisestab teksti
u = a.isupper()#kontrollib, kas tekstis on suurt2hti
l = a.islower()#kontrollib, kas tekstis on väiketähti
n = a.count(‘0’) + a.count(‘1’) + a.count(‘2’) + … + a.count(‘9’)#loeb mitu arvu on
s = len(a)#a pikkus
if not u and not l and n > 1 and s >= 8:
    print “ok”
#kui a ei ole suured ja ei ole v2iksed t2hed ja numbreid on rohkem kui 1 ja a pikkus on suurem v6i v6rdne 8 siis prindib ok



