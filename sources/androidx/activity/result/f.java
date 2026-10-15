package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public Random f2436a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2437b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f2438e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final transient HashMap f2439f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f2440g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f2441h = new Bundle();

    public final boolean a(int i4, int i5, Intent intent) {
        String str = (String) this.f2437b.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        this.f2438e.remove(str);
        d dVar = (d) this.f2439f.get(str);
        if (dVar != null) {
            dVar.f2433a.g(new a(intent, i5));
            return true;
        }
        this.f2440g.remove(str);
        this.f2441h.putParcelable(str, new a(intent, i5));
        return true;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.activity.result.c, java.lang.Object] */
    public final c b(final String str, androidx.activity.d dVar, final C2033d c2033d, final b bVar) {
        int i4;
        HashMap hashMap;
        int i5;
        k kVar = dVar.f2415q;
        if (kVar.c.a()) {
            throw new IllegalStateException("LifecycleOwner " + dVar + " is attempting to register while current state is " + kVar.c + ". LifecycleOwners must call register before they are STARTED.");
        }
        HashMap hashMap2 = this.c;
        Integer num = (Integer) hashMap2.get(str);
        if (num != null) {
            i5 = num.intValue();
        } else {
            int nextInt = this.f2436a.nextInt(2147418112);
            while (true) {
                i4 = nextInt + 65536;
                Integer valueOf = Integer.valueOf(i4);
                hashMap = this.f2437b;
                if (!hashMap.containsKey(valueOf)) {
                    break;
                }
                nextInt = this.f2436a.nextInt(2147418112);
            }
            hashMap.put(Integer.valueOf(i4), str);
            hashMap2.put(str, Integer.valueOf(i4));
            i5 = i4;
        }
        HashMap hashMap3 = this.d;
        e eVar = (e) hashMap3.get(str);
        if (eVar == null) {
            eVar = new e(kVar);
        }
        h hVar = new h() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.h
            public final void a(i iVar, androidx.lifecycle.f fVar) {
                Integer num2;
                boolean equals = androidx.lifecycle.f.ON_START.equals(fVar);
                String str2 = str;
                f fVar2 = f.this;
                if (equals) {
                    HashMap hashMap4 = fVar2.f2439f;
                    Bundle bundle = fVar2.f2441h;
                    HashMap hashMap5 = fVar2.f2440g;
                    b bVar2 = bVar;
                    hashMap4.put(str2, new d(bVar2, c2033d));
                    if (hashMap5.containsKey(str2)) {
                        Object obj = hashMap5.get(str2);
                        hashMap5.remove(str2);
                        bVar2.g(obj);
                    }
                    a aVar = (a) bundle.getParcelable(str2);
                    if (aVar != null) {
                        bundle.remove(str2);
                        bVar2.g(new a(aVar.f2430p, aVar.f2429o));
                        return;
                    }
                    return;
                }
                if (androidx.lifecycle.f.ON_STOP.equals(fVar)) {
                    fVar2.f2439f.remove(str2);
                    return;
                }
                if (androidx.lifecycle.f.ON_DESTROY.equals(fVar)) {
                    HashMap hashMap6 = fVar2.d;
                    Bundle bundle2 = fVar2.f2441h;
                    HashMap hashMap7 = fVar2.f2440g;
                    if (!fVar2.f2438e.contains(str2) && (num2 = (Integer) fVar2.c.remove(str2)) != null) {
                        fVar2.f2437b.remove(num2);
                    }
                    fVar2.f2439f.remove(str2);
                    if (hashMap7.containsKey(str2)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + hashMap7.get(str2));
                        hashMap7.remove(str2);
                    }
                    if (bundle2.containsKey(str2)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + bundle2.getParcelable(str2));
                        bundle2.remove(str2);
                    }
                    e eVar2 = (e) hashMap6.get(str2);
                    if (eVar2 != null) {
                        ArrayList arrayList = eVar2.f2435b;
                        int size = arrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = arrayList.get(i6);
                            i6++;
                            eVar2.f2434a.f((h) obj2);
                        }
                        arrayList.clear();
                        hashMap6.remove(str2);
                    }
                }
            }
        };
        eVar.f2434a.a(hVar);
        eVar.f2435b.add(hVar);
        hashMap3.put(str, eVar);
        ?? obj = new Object();
        obj.c = this;
        obj.f2432b = str;
        obj.f2431a = i5;
        return obj;
    }
}
