/* Generated By:JavaCC: Do not edit this line. MyParserTokenManager.java */

/** Token Manager. */
public class MyParserTokenManager implements MyParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7fe03faL) != 0L)
         {
            jjmatchedKind = 27;
            return 2;
         }
         return -1;
      case 1:
         if ((active0 & 0x8L) != 0L)
            return 2;
         if ((active0 & 0x7fe03f2L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 1;
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0x202L) != 0L)
            return 2;
         if ((active0 & 0x7fe01f0L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 2;
            return 2;
         }
         return -1;
      case 3:
         if ((active0 & 0x600150L) != 0L)
            return 2;
         if ((active0 & 0x79e00a0L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 3;
            return 2;
         }
         return -1;
      case 4:
         if ((active0 & 0x10000a0L) != 0L)
            return 2;
         if ((active0 & 0x69e0000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 4;
            return 2;
         }
         return -1;
      case 5:
         if ((active0 & 0x49a0000L) != 0L)
            return 2;
         if ((active0 & 0x2040000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 5;
            return 2;
         }
         return -1;
      case 6:
         if ((active0 & 0x2000000L) != 0L)
            return 2;
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 12:
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 13:
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 14:
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 15:
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 16:
         if ((active0 & 0x40000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 14);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 40:
         return jjStopAtPos(0, 34);
      case 41:
         return jjStopAtPos(0, 35);
      case 42:
         return jjStopAtPos(0, 12);
      case 43:
         return jjStopAtPos(0, 10);
      case 44:
         return jjStopAtPos(0, 32);
      case 45:
         return jjStopAtPos(0, 11);
      case 46:
         return jjStopAtPos(0, 31);
      case 59:
         return jjStopAtPos(0, 33);
      case 60:
         return jjStopAtPos(0, 15);
      case 61:
         return jjStopAtPos(0, 16);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x840000L);
      case 91:
         return jjStopAtPos(0, 36);
      case 93:
         return jjStopAtPos(0, 37);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2000010L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xaL);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x140L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 123:
         return jjStopAtPos(0, 38);
      case 125:
         return jjStopAtPos(0, 39);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x400080L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x4020200L);
      case 102:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(1, 3, 2);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x120L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000010L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x2L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x900000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x1100000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x600120L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x40010L);
      case 116:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(2, 1, 2);
         return jjMoveStringLiteralDfa3_0(active0, 0x6000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 119:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 2);
         break;
      case 101:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(3, 4, 2);
         else if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x80020L);
      case 110:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 2);
         break;
      case 115:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000080L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x140000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 2);
         else if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(4, 7, 2);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 104:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x180000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x2800000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 115:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 24, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(5, 19, 2);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(5, 20, 2);
         break;
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 103:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 2);
         break;
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 110:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 26, 2);
         break;
      case 116:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 17, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 115:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(6, 25, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa11_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa12_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa13_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa14_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
static private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa15_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
static private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa16_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
static private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa17_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
static private int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(17, 18);
         break;
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 13;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(3);
                  }
                  else if (curChar == 47)
                     jjAddStates(0, 1);
                  if ((0x3000000000000L & l) != 0L)
                  {
                     if (kind > 2)
                        kind = 2;
                     jjCheckNAdd(0);
                  }
                  break;
               case 0:
                  if ((0x3000000000000L & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if (curChar == 47)
                     jjAddStates(0, 1);
                  break;
               case 5:
                  if (curChar != 47)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(6);
                  break;
               case 6:
                  if ((0xfffffffffffffbffL & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(6);
                  break;
               case 7:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 8:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 9:
                  if (curChar == 42)
                     jjAddStates(2, 3);
                  break;
               case 10:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(11, 9);
                  break;
               case 11:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(11, 9);
                  break;
               case 12:
                  if (curChar == 47 && kind > 45)
                     kind = 45;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(2);
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(2);
                  break;
               case 6:
                  if (kind > 44)
                     kind = 44;
                  jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  jjCheckNAddTwoStates(8, 9);
                  break;
               case 10:
               case 11:
                  jjCheckNAddTwoStates(11, 9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 10:
               case 11:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(11, 9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 13 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   5, 7, 10, 12, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\151\156\164", null, "\151\146", "\145\154\163\145", 
"\167\150\151\154\145", "\164\162\165\145", "\146\141\154\163\145", "\164\150\151\163", 
"\156\145\167", "\53", "\55", "\52", "\46\46", "\41", "\74", "\75", 
"\154\145\156\147\150\164", "\123\171\163\164\145\155\56\157\165\164\56\160\162\151\156\164\154\156", 
"\160\165\142\154\151\143", "\163\164\141\164\151\143", "\166\157\151\144", "\155\141\151\156", 
"\123\164\162\151\156\147", "\143\154\141\163\163", "\145\170\164\145\156\144\163", 
"\162\145\164\165\162\156", null, null, null, null, "\56", "\54", "\73", "\50", "\51", "\133", "\135", 
"\173", "\175", null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffcfffffffL, 
};
static final long[] jjtoSkip = {
   0x3f0000000000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[13];
static private final int[] jjstateSet = new int[26];
static protected char curChar;
/** Constructor. */
public MyParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public MyParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 13; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
