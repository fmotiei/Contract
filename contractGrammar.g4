grammar contractGrammar;
r : (N vg | vf)*;
N : ('a'..'z')+('a'..'z' | '0'..'9')*;
T : 'Int' | 'Double' | 'Date' | 'Contract';
VI : ('0'..'9')+;
va : ',' T va| ;
df : '(' T va ') -> ' T;
DT : 'TimeFunc(Date) -> Double';
vb : T | df | DT;
vj : VI | ;
ve : | '(' ars ')';
ar : ex;
ars : ar (','ar)*;
vd : |'.'vj;
vf : 'mkdate' '(' ar ',' ar ')' | ('and' | 'then' | 'scaleX' | 'scale' | 'truncate') '(' ar ',' ar ')' | 'one()' | 'give' '(' ar ')';
vc : N ve | VI vd | '(' ex ')' | vf;
b : | ('+' | '-' | '*' | '/') vc b;
ex : vc b;
vg : '::'vb | '(' ars ')' | '=' ex;
WS: [ \t\n]+ -> skip ; //momkene moshkel dashte bashe





