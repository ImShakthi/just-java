package com.imshakthi.codility;

public class Snippets {

  // https://app.codility.com/c/run/training35PMAG-9D7/
  public int getDeepestWaterBlock(final int[] altitudes) {
    if (altitudes == null || altitudes.length == 0) {
      return 0;
    }

    int left = 0;
    int right = altitudes.length - 1;
    int leftMax = altitudes[left];
    int rightMax = altitudes[right];
    int maxDepth = 0;

    while (left < right) {
      if (altitudes[left] < altitudes[right]) {
        left++;
        leftMax = Math.max(leftMax, altitudes[left]);
        maxDepth = Math.max(maxDepth, leftMax - altitudes[left]);
      } else {
        right--;
        rightMax = Math.max(rightMax, altitudes[right]);
        maxDepth = Math.max(maxDepth, rightMax - altitudes[right]);
      }
    }

    return maxDepth;
  }
}
