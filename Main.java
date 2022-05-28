class Main {

  public static void main(String args[]) {
    // 昇順にソートされた配列
    int[] sortedArray = { 1, 2, 3, 5, 12, 7890, 12345 };
    // 探索対象の番号
    int targetNumber = 7890;
    // 探索実行
    int targetIndex = new Main().serchIndex(sortedArray, targetNumber);
    // 結果出力
    System.out.println(targetIndex);
  }

  private int serchIndex(int[] sortedArray, int targetNumber) {

    // ここから記述

	//index of array's median
	int mid = sortedArray.length /2;

	int left = 0; //left-end of searching array area
	int right = sortedArray.length; //right end of searching array area

	//if original array's median is equal to targetNumber, return index of array's median
	if(sortedArray[mid] == targetNumber) {
		return mid;
	}

	//continue search until  searching array's left-end equals right-end. if they are equal, it means targetNumber wasn't found
	while(left != right) {
		//if median of searching array is larget than targetNum, update right-end
		if(sortedArray[mid] > targetNumber) {
			mid = (left+right)/2;

			if(sortedArray[mid] == targetNumber) {
				return mid;
			}
			right = mid;
		}
		//if median of searching array is larget than targetNum, update left-end
		else if(sortedArray[mid] < targetNumber) {
			mid = (left+right)/2;

			if(sortedArray[mid] == targetNumber) {
				return mid;
			}
			left = mid;
		}
	}
    // ここまで記述
    // 探索対象が存在しない場合、-1を返却
    return -1;
  }
}
