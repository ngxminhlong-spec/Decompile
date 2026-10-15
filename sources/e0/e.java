package e0;

import android.database.Cursor;
import h0.C1694b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12672a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12673b;
    public final Set c;
    public final Set d;

    public e(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        this.f12672a = str;
        this.f12673b = Collections.unmodifiableMap(hashMap);
        this.c = Collections.unmodifiableSet(hashSet);
        this.d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static e a(C1694b c1694b, String str) {
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList;
        Cursor j4 = c1694b.j(U.a.k("PRAGMA table_info(`", str, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (j4.getColumnCount() > 0) {
                int columnIndex = j4.getColumnIndex("name");
                int columnIndex2 = j4.getColumnIndex("type");
                int columnIndex3 = j4.getColumnIndex("notnull");
                int columnIndex4 = j4.getColumnIndex("pk");
                int columnIndex5 = j4.getColumnIndex("dflt_value");
                while (j4.moveToNext()) {
                    String string = j4.getString(columnIndex);
                    hashMap.put(string, new C1658a(j4.getInt(columnIndex4), 2, string, j4.getString(columnIndex2), j4.getString(columnIndex5), j4.getInt(columnIndex3) != 0));
                }
            }
            j4.close();
            HashSet hashSet = new HashSet();
            j4 = c1694b.j("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = j4.getColumnIndex("id");
                int columnIndex7 = j4.getColumnIndex("seq");
                int columnIndex8 = j4.getColumnIndex("table");
                int columnIndex9 = j4.getColumnIndex("on_delete");
                int columnIndex10 = j4.getColumnIndex("on_update");
                ArrayList b4 = b(j4);
                int count = j4.getCount();
                int i8 = 0;
                while (i8 < count) {
                    j4.moveToPosition(i8);
                    if (j4.getInt(columnIndex7) != 0) {
                        i4 = i8;
                        i5 = columnIndex6;
                        i6 = columnIndex7;
                        arrayList = b4;
                        i7 = count;
                    } else {
                        int i9 = j4.getInt(columnIndex6);
                        i4 = i8;
                        ArrayList arrayList2 = new ArrayList();
                        i5 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        i6 = columnIndex7;
                        int size = b4.size();
                        i7 = count;
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = b4.get(i10);
                            i10++;
                            int i11 = size;
                            c cVar = (c) obj;
                            ArrayList arrayList4 = b4;
                            if (cVar.f12666o == i9) {
                                arrayList2.add(cVar.f12668q);
                                arrayList3.add(cVar.f12669r);
                            }
                            size = i11;
                            b4 = arrayList4;
                        }
                        arrayList = b4;
                        hashSet.add(new C1659b(j4.getString(columnIndex8), j4.getString(columnIndex9), j4.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i8 = i4 + 1;
                    columnIndex6 = i5;
                    columnIndex7 = i6;
                    count = i7;
                    b4 = arrayList;
                }
                j4.close();
                j4 = c1694b.j("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = j4.getColumnIndex("name");
                    int columnIndex12 = j4.getColumnIndex("origin");
                    int columnIndex13 = j4.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (j4.moveToNext()) {
                            if ("c".equals(j4.getString(columnIndex12))) {
                                d c = c(c1694b, j4.getString(columnIndex11), j4.getInt(columnIndex13) == 1);
                                if (c != null) {
                                    hashSet3.add(c);
                                }
                            }
                        }
                        j4.close();
                        hashSet2 = hashSet3;
                        return new e(str, hashMap, hashSet, hashSet2);
                    }
                    return new e(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < count; i4++) {
            cursor.moveToPosition(i4);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static d c(C1694b c1694b, String str, boolean z4) {
        Cursor j4 = c1694b.j(U.a.k("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = j4.getColumnIndex("seqno");
            int columnIndex2 = j4.getColumnIndex("cid");
            int columnIndex3 = j4.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (j4.moveToNext()) {
                    if (j4.getInt(columnIndex2) >= 0) {
                        int i4 = j4.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i4), j4.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, z4, arrayList);
                j4.close();
                return dVar;
            }
            j4.close();
            return null;
        } catch (Throwable th) {
            j4.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Set set2 = eVar.c;
        Map map = eVar.f12673b;
        String str = eVar.f12672a;
        String str2 = this.f12672a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map2 = this.f12673b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set3 = this.c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.d;
        if (set4 == null || (set = eVar.d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f12672a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f12673b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f12672a + "', columns=" + this.f12673b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
