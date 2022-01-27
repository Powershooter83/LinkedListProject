package me.prouge.linkedListProject;

public class NumberMemory<T extends Number> implements INumberMemory<T> {


    Element<T> firstElement;

    @Override
    public void add(T n) {
        Element<T> elementToAdd = new Element<T>(null, null, n);
        if (firstElement == null) {
            firstElement = elementToAdd;
        } else {
            Element<T> loopedElement = firstElement;
            while (loopedElement.getNextElem() != null) {
                loopedElement = loopedElement.getNextElem();
            }
            loopedElement.setNextElem(elementToAdd);
        }
    }

    @Override
    public boolean contains(T n) {
        Element<T> loopedElement = firstElement;
        while (loopedElement != null) {
            if (loopedElement.getNumber().equals(n)) {
                return true;
            }
            loopedElement = loopedElement.getNextElem();
        }
        return false;
    }

    public void printToConsole() {
        Element<T> loopedElement = firstElement;
        while (loopedElement != null) {
            System.out.println(loopedElement.getNumber());
            loopedElement = loopedElement.getNextElem();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void get(SortOder sortOder) {
        StringBuilder numbers = new StringBuilder();
        Element<T> loopedElement = firstElement;
        while (loopedElement != null) {
            numbers.append(loopedElement.getNumber()).append(",");
            loopedElement = loopedElement.getNextElem();
        }
        String[] splitted = numbers.toString().split(",");
        Object[] numbersArray = new Object[splitted.length];
        System.arraycopy(splitted, 0, numbersArray, 0, splitted.length);
        StringBuilder toReturn = new StringBuilder();
        int counting = numbersArray.length;
        if (sortOder == SortOder.ASCENDING) {
            while (counting != 0) {
                Object highestNumber = 0;
                int highestSorting = 0;
                for (int i = 0; i < numbersArray.length; i++) {
                    try {
                        long test = Long.parseLong(String.valueOf(numbersArray[i]));
                        if (test > Long.parseLong(highestNumber.toString())) {
                            highestNumber = numbersArray[i];
                            highestSorting = i;
                        }
                        continue;
                    } catch (NumberFormatException ignored) {
                    }
                    try {
                        int test = Integer.parseInt(String.valueOf(numbersArray[i]));
                        if (test > Integer.parseInt(highestNumber.toString())) {
                            highestNumber = numbersArray[i];
                            highestSorting = i;
                        }
                        continue;
                    } catch (NumberFormatException ignored) {
                    }
                    try {
                        short test = Short.parseShort(String.valueOf(numbersArray[i]));
                        if (test > Short.parseShort(highestNumber.toString())) {
                            highestNumber = numbersArray[i];
                            highestSorting = i;
                        }
                        continue;
                    } catch (NumberFormatException ignored) {
                    }
                    try {
                        byte test = Byte.parseByte(String.valueOf(numbersArray[i]));
                        if (test > Byte.parseByte(highestNumber.toString())) {
                            highestNumber = numbersArray[i];
                            highestSorting = i;
                        }
                        continue;
                    } catch (NumberFormatException ignored) {
                    }
                    try {
                        float test = Float.parseFloat(String.valueOf(numbersArray[i]));
                        if (test > Short.parseShort(highestNumber.toString())) {
                            highestNumber = numbersArray[i];
                            highestSorting = i;
                        }
                        continue;
                    } catch (NumberFormatException ignored) {
                    }
                    try {
                        double test = Double.parseDouble(String.valueOf(numbersArray[i]));
                        if (test > Double.parseDouble(highestNumber.toString())) {
                            highestNumber = numbersArray[i];
                            highestSorting = i;
                        }
                    } catch (NumberFormatException ignored) {
                    }
                }
                toReturn.append(highestNumber).append(",");
                Object[] numbersArray2 = new Object[splitted.length - 1];
                int countingToAdd = 0;
                for (int i = 0; i < numbersArray.length; i++) {
                    if (i != highestSorting) {
                        numbersArray2[countingToAdd] = numbersArray[i];
                        countingToAdd++;
                    }
                }

                numbersArray = numbersArray2;
                counting--;
            }

        } else {
            Object highestNumber = 0;
            for (Object o : numbersArray) {
                try {
                    long highestNumberLocal = Long.parseLong(String.valueOf(o));
                    if (Long.parseLong(String.valueOf(highestNumber)) < highestNumberLocal) {
                        highestNumber = highestNumberLocal;
                    }
                    continue;
                } catch (NumberFormatException ignored) {

                }
                try {
                    int highestNumberLocal = Integer.parseInt(String.valueOf(o));
                    if (Integer.parseInt(String.valueOf(highestNumber)) < highestNumberLocal) {
                        highestNumber = highestNumberLocal;
                    }
                    continue;
                } catch (NumberFormatException ignored) {

                }
                try {
                    Short highestNumberLocal = Short.parseShort(String.valueOf(o));
                    if (Short.parseShort(String.valueOf(highestNumber)) < highestNumberLocal) {
                        highestNumber = highestNumberLocal;
                    }
                    continue;
                } catch (NumberFormatException ignored) {

                }
                try {
                    byte highestNumberLocal = Byte.parseByte(String.valueOf(o));
                    if (Byte.parseByte(String.valueOf(highestNumber)) < highestNumberLocal) {
                        highestNumber = highestNumberLocal;
                    }
                    continue;
                } catch (NumberFormatException ignored) {

                }
                try {
                    float highestNumberLocal = Float.parseFloat(String.valueOf(o));
                    if (Float.parseFloat(String.valueOf(highestNumber)) < highestNumberLocal) {
                        highestNumber = highestNumberLocal;
                    }
                    continue;
                } catch (NumberFormatException ignored) {

                }
                try {
                    double highestNumberLocal = Double.parseDouble(String.valueOf(o));
                    if (Double.parseDouble(String.valueOf(highestNumber)) < highestNumberLocal) {
                        highestNumber = highestNumberLocal;
                    }
                } catch (NumberFormatException ignored) {

                }

            }
            while (counting != 0) {
                Object highestNumberCopy = highestNumber;
                int highestSorting = 0;
                for (int i = 0; i < numbersArray.length; i++) {
                    try {
                        long test = Long.parseLong(String.valueOf(numbersArray[i]));
                        if (test <= Long.parseLong(highestNumberCopy.toString())) {
                            highestNumberCopy = numbersArray[i];
                            highestSorting = i;
                        }
                        continue;
                    } catch (NumberFormatException ignored) {
                    }
                    try {
                        int test = Integer.parseInt(String.valueOf(numbersArray[i]));
                        if (test <= Integer.parseInt(highestNumberCopy.toString())) {
                            highestNumberCopy = numbersArray[i];
                            highestSorting = i;
                        }
                        continue;
                    } catch (NumberFormatException ignored) {
                    }
                    try {
                        short test = Short.parseShort(String.valueOf(numbersArray[i]));
                        if (test <= Short.parseShort(highestNumberCopy.toString())) {
                            highestNumberCopy = numbersArray[i];
                            highestSorting = i;
                        }
                        continue;
                    } catch (NumberFormatException ignored) {
                    }
                    try {
                        byte test = Byte.parseByte(String.valueOf(numbersArray[i]));
                        if (test <= Byte.parseByte(highestNumberCopy.toString())) {
                            highestNumberCopy = numbersArray[i];
                            highestSorting = i;
                        }
                        continue;
                    } catch (NumberFormatException ignored) {
                    }
                    try {
                        float test = Float.parseFloat(String.valueOf(numbersArray[i]));
                        if (test <= Float.parseFloat(highestNumberCopy.toString())) {
                            highestNumberCopy = numbersArray[i];
                            highestSorting = i;
                        }
                        continue;
                    } catch (NumberFormatException ignored) {
                    }
                    try {
                        double test = Double.parseDouble(String.valueOf(numbersArray[i]));
                        if (test <= Double.parseDouble(highestNumberCopy.toString())) {
                            highestNumberCopy = numbersArray[i];
                            highestSorting = i;
                        }
                    } catch (NumberFormatException ignored) {
                    }

                }

                Object[] arrayRemoved = new Object[numbersArray.length - 1];
                int countingToAdd = 0;
                for (int i = 0; i < numbersArray.length; i++) {
                    if (i != highestSorting) {
                        arrayRemoved[countingToAdd] = numbersArray[i];
                        countingToAdd++;
                    }
                }
                numbersArray = arrayRemoved;
                toReturn.append(highestNumberCopy).append(",");
                counting--;

            }

        }
        System.out.println(toReturn.toString());
    }


    @Override
    public void clear() {
        firstElement = null;
    }
}
