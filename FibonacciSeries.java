����   B U  FibonacciSeries/FibonacciSeries  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this !LFibonacciSeries/FibonacciSeries; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Fibonacci Series till  terms: 
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V
  ( ) * nextInt ()I
  , -  close
 / 1 0 java/lang/Throwable 2 3 addSuppressed (Ljava/lang/Throwable;)V   5 6 7 makeConcatWithConstants (I)Ljava/lang/String; args [Ljava/lang/String; i I n 	FirstTerm 
SecondTerm num Ljava/util/Scanner; nextTerm StackMapTable 9 
SourceFile FibonacciSeries.java BootstrapMethods
 H J I $java/lang/invoke/StringConcatFactory 6 K �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; G N , InnerClasses Q %java/lang/invoke/MethodHandles$Lookup S java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      j     �<>6::� Y� � :� � !� '=� U� +� M:� � +�:� 
:� � 
� .�� � 4  � !`6>6����   ' 4    C C    
   2      	  
 !  '  b  n  t  w  {  ~  �     R    � 8 9    � : ;  '  < ;  b " < ;   � = ;   } > ;   ' ? @  t 
 A ;  B   4 � 4  C  / /   /� B /�   C    D    E F     L  M O   
  P R T 