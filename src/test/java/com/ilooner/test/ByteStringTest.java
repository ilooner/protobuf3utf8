package com.ilooner.test;

import org.junit.Test;
import com.google.protobuf.ByteString;

public class ByteStringTest
{
  @Test
  public void byteConsistency() {
    byte[] vals = new byte[] {0, 110, -1};
    ByteString original = ByteString.copyFrom(vals);
    ByteString newString = ByteString.copyFromUtf8(original.toStringUtf8());

    for (int index = 0; index < newString.size(); index++) {
      System.out.println(newString.byteAt(index));
    }

    System.out.println("String");

    for (byte stringVal: original.toStringUtf8().getBytes()) {
      System.out.println(stringVal);
    }
  }
}
