package c0;

import android.content.Context;
import android.util.Log;
import d0.AbstractC1649a;
import g0.InterfaceC1679a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3515a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3516b;
    public ArrayList c;
    public Executor d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f3517e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1679a f3518f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3519g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3520h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3521i;

    /* renamed from: j, reason: collision with root package name */
    public final x0.f f3522j;

    /* renamed from: k, reason: collision with root package name */
    public HashSet f3523k;

    public C0226g(Context context, String str) {
        this.f3516b = context;
        this.f3515a = str;
        x0.f fVar = new x0.f(26, false);
        fVar.f15212p = new HashMap();
        this.f3522j = fVar;
    }

    public final void a(AbstractC1649a... abstractC1649aArr) {
        if (this.f3523k == null) {
            this.f3523k = new HashSet();
        }
        for (AbstractC1649a abstractC1649a : abstractC1649aArr) {
            this.f3523k.add(Integer.valueOf(abstractC1649a.f12595a));
            this.f3523k.add(Integer.valueOf(abstractC1649a.f12596b));
        }
        x0.f fVar = this.f3522j;
        fVar.getClass();
        for (AbstractC1649a abstractC1649a2 : abstractC1649aArr) {
            int i4 = abstractC1649a2.f12595a;
            int i5 = abstractC1649a2.f12596b;
            HashMap hashMap = (HashMap) fVar.f15212p;
            TreeMap treeMap = (TreeMap) hashMap.get(Integer.valueOf(i4));
            if (treeMap == null) {
                treeMap = new TreeMap();
                hashMap.put(Integer.valueOf(i4), treeMap);
            }
            AbstractC1649a abstractC1649a3 = (AbstractC1649a) treeMap.get(Integer.valueOf(i5));
            if (abstractC1649a3 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC1649a3 + " with " + abstractC1649a2);
            }
            treeMap.put(Integer.valueOf(i5), abstractC1649a2);
        }
    }
}
