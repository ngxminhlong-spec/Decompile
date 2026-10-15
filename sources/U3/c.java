package U3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c extends d {
    public static List K(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return K3.d.f1067o;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            List singletonList = Collections.singletonList(next);
            S3.e.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
