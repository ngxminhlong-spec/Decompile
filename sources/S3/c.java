package S3;

import R3.l;
import R3.m;
import R3.n;
import R3.o;
import R3.p;
import R3.q;
import R3.r;
import R3.s;
import R3.t;
import R3.u;
import R3.v;
import d3.AbstractC1654b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m2.AbstractC1806a;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements T3.b, b {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1785b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f1786a;

    static {
        Map map;
        int i4 = 0;
        List D4 = AbstractC1654b.D(Y3.i.class, R3.k.class, o.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, R3.a.class, R3.b.class, R3.c.class, R3.d.class, R3.e.class, R3.f.class, R3.g.class, R3.h.class, R3.i.class, R3.j.class, l.class, m.class, n.class);
        ArrayList arrayList = new ArrayList(D4 instanceof Collection ? D4.size() : 10);
        int i5 = 0;
        for (Object obj : D4) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new J3.c((Class) obj, Integer.valueOf(i5)));
            i5 = i6;
        }
        int size = arrayList.size();
        if (size == 0) {
            map = K3.e.f1068o;
        } else if (size != 1) {
            map = new LinkedHashMap(AbstractC1806a.J(arrayList.size()));
            int size2 = arrayList.size();
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                J3.c cVar = (J3.c) obj2;
                map.put(cVar.f1029o, cVar.f1030p);
            }
        } else {
            J3.c cVar2 = (J3.c) arrayList.get(0);
            e.e(cVar2, "pair");
            map = Collections.singletonMap(cVar2.f1029o, cVar2.f1030p);
            e.d(map, "singletonMap(...)");
        }
        f1785b = map;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        e.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            e.b(str);
            sb.append(V3.g.V(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f1785b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1806a.J(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), V3.g.V((String) entry2.getValue()));
        }
    }

    public c(Class cls) {
        this.f1786a = cls;
    }

    @Override // S3.b
    public final Class a() {
        return this.f1786a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && AbstractC1895f.p(this).equals(AbstractC1895f.p((T3.b) obj));
    }

    public final int hashCode() {
        return AbstractC1895f.p(this).hashCode();
    }

    public final String toString() {
        return this.f1786a.toString() + " (Kotlin reflection is not available)";
    }
}
