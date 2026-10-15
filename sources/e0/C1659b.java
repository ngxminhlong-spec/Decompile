package e0;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1659b {

    /* renamed from: a, reason: collision with root package name */
    public final String f12663a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12664b;
    public final String c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f12665e;

    public C1659b(String str, String str2, String str3, List list, List list2) {
        this.f12663a = str;
        this.f12664b = str2;
        this.c = str3;
        this.d = Collections.unmodifiableList(list);
        this.f12665e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1659b.class != obj.getClass()) {
            return false;
        }
        C1659b c1659b = (C1659b) obj;
        if (this.f12663a.equals(c1659b.f12663a) && this.f12664b.equals(c1659b.f12664b) && this.c.equals(c1659b.c) && this.d.equals(c1659b.d)) {
            return this.f12665e.equals(c1659b.f12665e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12665e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.f12664b.hashCode() + (this.f12663a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f12663a + "', onDelete='" + this.f12664b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.f12665e + '}';
    }
}
