package com.google.android.gms.internal.ads;

import b0.RunnableC0203p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Kk {

    /* renamed from: a, reason: collision with root package name */
    public final Ck f6047a;

    /* renamed from: b, reason: collision with root package name */
    public final Sj f6048b;
    public final Object c = new Object();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f6049e;

    public Kk(Ck ck, Sj sj) {
        this.f6047a = ck;
        this.f6048b = sj;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            try {
                if (!this.f6049e) {
                    Ck ck = this.f6047a;
                    if (!ck.f4526b) {
                        O1.C0 c02 = new O1.C0(1, this);
                        Ck ck2 = this.f6047a;
                        ck2.getClass();
                        ck2.f4527e.f5017o.a(new RunnableC0203p(26, ck2, c02), ck2.f4532j);
                        return jSONArray;
                    }
                    b(ck.a());
                }
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    jSONArray.put(((Jk) obj).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List list) {
        String str;
        String str2;
        C0435ba c0435ba;
        Rj a4;
        C0435ba c0435ba2;
        synchronized (this.c) {
            try {
                if (this.f6049e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C1325w8 c1325w8 = (C1325w8) it.next();
                    C0937n6 c0937n6 = AbstractC1066q6.l8;
                    O1.r rVar = O1.r.d;
                    if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                        Rj a5 = this.f6048b.a(c1325w8.f11113o);
                        if (a5 != null && (c0435ba2 = a5.c) != null) {
                            str = c0435ba2.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str3 = str;
                    boolean z4 = ((Boolean) rVar.c.a(AbstractC1066q6.m8)).booleanValue() && (a4 = this.f6048b.a(c1325w8.f11113o)) != null && a4.d;
                    ArrayList arrayList = this.d;
                    String str4 = c1325w8.f11113o;
                    Rj a6 = this.f6048b.a(str4);
                    if (a6 != null && (c0435ba = a6.f6830b) != null) {
                        str2 = c0435ba.toString();
                        arrayList.add(new Jk(str4, str3, str2, c1325w8.f11114p ? 1 : 0, c1325w8.f11116r, c1325w8.f11115q, z4));
                    }
                    str2 = "";
                    arrayList.add(new Jk(str4, str3, str2, c1325w8.f11114p ? 1 : 0, c1325w8.f11116r, c1325w8.f11115q, z4));
                }
                this.f6049e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
