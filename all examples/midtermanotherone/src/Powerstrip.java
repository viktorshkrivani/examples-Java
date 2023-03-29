public static int[] getAllNumbersEvenlyDivisibleByValue(int[] array, int value) {
        int[] result = new int[array.length];
        int resultIndex = 0;
        for (int i = 0; i < array.length; i++) {
        if (array[i] % value == 0) {
        result[resultIndex] = array[i];
        resultIndex++;
        }
        }
        return Arrays.copyOf(result, resultIndex);
        }