����   B Y
      java/lang/Object <init> ()V	  	 
   Linked_List head LLinked_List$Node;  Linked_List$Node
     (I)V	     next	      java/lang/System out Ljava/io/PrintStream;  !List is empty. Nothing to delete.
     ! " java/io/PrintStream println (Ljava/lang/String;)V	  $ % & data I   ( ) * makeConcatWithConstants (I)Ljava/lang/String;
  , - " print / null
  
  2 3  insertAtBeginning
  5 6  insertAtEnd 8 Linked List after insertions:
  : ;  	printList
  = >  deleteFromBeginning @ *Linked List after deletion from beginning: Code LineNumberTable StackMapTable main ([Ljava/lang/String;)V 
SourceFile Linked_List.java NestMembers BootstrapMethods K  ->  M
 N O P ) Q $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses Node U %java/lang/invoke/MethodHandles$Lookup W java/lang/invoke/MethodHandles Lookup !                A   *     
*� *� �    B          	   3   A   ;     � Y� M,*� � *,� �    B        	       6   A   ~     2� Y� M*� � *,� � *� N-� � -� N���-,� �    B   "    ! 	 "  $  '  ( $ ) , , 1 . C    �  �  �   >   A   L     *� � � � � **� � � �    B       3  4  7  9 C    
  ;   A   d     )*� L+� � +� #� '  � ++� L��� .� �    B       =  > 	 ?  @   B ( C C   	 �   	 D E  A   s     7� Y� 0L+
� 1+� 1+� 4� 7� +� 9+� <� ?� +� 9�    B   * 
   G  J  K  N  Q " R & U * V 2 W 6 X  F    G H      I     L  J R       S 
 T V X 