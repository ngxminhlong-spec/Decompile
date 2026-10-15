package com.google.firebase.storage;

import Q1.z;
import android.net.Uri;
import android.text.TextUtils;
import h2.y;
import j3.C1734a;
import j3.C1735b;
import j3.C1739f;
import l3.InterfaceC1800a;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d3.g f12549a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2053a f12550b;
    public final InterfaceC2053a c;
    public final String d;

    public b(String str, d3.g gVar, InterfaceC2053a interfaceC2053a, InterfaceC2053a interfaceC2053a2) {
        this.d = str;
        this.f12549a = gVar;
        this.f12550b = interfaceC2053a;
        this.c = interfaceC2053a2;
        if (interfaceC2053a2 == null || interfaceC2053a2.get() == null) {
            return;
        }
        InterfaceC1800a interfaceC1800a = (InterfaceC1800a) interfaceC2053a2.get();
        V2.e eVar = new V2.e(18);
        C1735b c1735b = (C1735b) interfaceC1800a;
        c1735b.getClass();
        c1735b.f13334a.add(eVar);
        C1739f c1739f = c1735b.d;
        int size = c1735b.f13335b.size() + c1735b.f13334a.size();
        if (c1739f.f13347b == 0 && size > 0) {
            c1739f.f13347b = size;
        } else if (c1739f.f13347b > 0 && size == 0) {
            c1739f.f13346a.getClass();
        }
        c1739f.f13347b = size;
        z zVar = c1735b.f13341j;
        if (zVar != null) {
            long j4 = zVar.f1736o + zVar.f1737p;
            c1735b.f13340i.getClass();
            if (j4 - System.currentTimeMillis() > 300000) {
                C1734a.a(c1735b.f13341j);
            }
        }
    }

    public static b a(d3.g gVar, Uri uri) {
        b bVar;
        String host = uri != null ? uri.getHost() : null;
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        gVar.a();
        c cVar = (c) gVar.d.a(c.class);
        y.j(cVar, "Firebase Storage component is not present.");
        synchronized (cVar) {
            bVar = (b) cVar.f12551a.get(host);
            if (bVar == null) {
                bVar = new b(host, cVar.f12552b, cVar.c, cVar.d);
                cVar.f12551a.put(host, bVar);
            }
        }
        return bVar;
    }
}
