package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I9 implements S1.n {

    /* renamed from: a, reason: collision with root package name */
    public final Date f5549a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5550b;
    public final Set c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5551e;

    /* renamed from: f, reason: collision with root package name */
    public final C0766j7 f5552f;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5554h;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5553g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f5555i = new HashMap();

    public I9(Date date, int i4, HashSet hashSet, boolean z4, int i5, C0766j7 c0766j7, List list, boolean z5) {
        this.f5549a = date;
        this.f5550b = i4;
        this.c = hashSet;
        this.d = z4;
        this.f5551e = i5;
        this.f5552f = c0766j7;
        this.f5554h = z5;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f5555i.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f5555i.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f5553g.add(str);
                }
            }
        }
    }

    @Override // S1.d
    public final boolean a() {
        return this.f5554h;
    }

    @Override // S1.d
    public final Date b() {
        return this.f5549a;
    }

    @Override // S1.d
    public final boolean c() {
        return this.d;
    }

    @Override // S1.d
    public final Set d() {
        return this.c;
    }

    @Override // S1.d
    public final int e() {
        return this.f5551e;
    }

    @Override // S1.d
    public final int f() {
        return this.f5550b;
    }
}
