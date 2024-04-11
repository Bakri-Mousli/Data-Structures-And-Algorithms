package Sorting.Core;

public class mergeSort3Way {
    public void mergeSort3Way(Integer[] gArray)
    {
        if (gArray == null)
            return;
        Integer[] fArray = new Integer[gArray.length];
        for (int i = 0; i < fArray.length; i++)
            fArray[i] = gArray[i];
        mergeSort3WayRec(fArray, 0, gArray.length, gArray);

        for (int i = 0; i < fArray.length; i++)
            gArray[i] = fArray[i];
    }

    public void mergeSort3WayRec(Integer[] gArray,
                                        int low, int high, Integer[] destArray)
    {
        if (high - low < 2)
            return;

        int mid1 = low + ((high - low) / 3);
        int mid2 = low + 2 * ((high - low) / 3) + 1;

        mergeSort3WayRec(destArray, low, mid1, gArray);
        mergeSort3WayRec(destArray, mid1, mid2, gArray);
        mergeSort3WayRec(destArray, mid2, high, gArray);

        // Merging the sorted arrays
        merge(destArray, low, mid1, mid2, high, gArray);
    }

    public void merge(Integer[] gArray, int low,
                             int mid1, int mid2, int high,
                             Integer[] destArray)
    {
        int i = low, j = mid1, k = mid2, l = low;
        while ((i < mid1) && (j < mid2) && (k < high))
        {
            if (gArray[i].compareTo(gArray[j]) < 0)
            {
                if (gArray[i].compareTo(gArray[k]) < 0)
                    destArray[l++] = gArray[i++];

                else
                    destArray[l++] = gArray[k++];
            }
            else
            {
                if (gArray[j].compareTo(gArray[k]) < 0)
                    destArray[l++] = gArray[j++];
                else
                    destArray[l++] = gArray[k++];
            }
        }

        while ((i < mid1) && (j < mid2))
        {
            if (gArray[i].compareTo(gArray[j]) < 0)
                destArray[l++] = gArray[i++];
            else
                destArray[l++] = gArray[j++];
        }

        while ((j < mid2) && (k < high))
        {
            if (gArray[j].compareTo(gArray[k]) < 0)
                destArray[l++] = gArray[j++];

            else
                destArray[l++] = gArray[k++];
        }

        while ((i < mid1) && (k < high))
        {
            if (gArray[i].compareTo(gArray[k]) < 0)
                destArray[l++] = gArray[i++];
            else
                destArray[l++] = gArray[k++];
        }

        while (i < mid1)
            destArray[l++] = gArray[i++];

        while (j < mid2)
            destArray[l++] = gArray[j++];

        while (k < high)
            destArray[l++] = gArray[k++];
    }
}