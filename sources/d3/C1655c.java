package d3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n3.C1814a;
import n3.C1819f;
import n3.InterfaceC1817d;
import n3.q;
import u3.InterfaceC2015a;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: d3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1655c implements InterfaceC2053a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12610b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1655c(int i4, Object obj, Object obj2) {
        this.f12609a = i4;
        this.f12610b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, B3.a] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.Qb, java.lang.Object] */
    @Override // w3.InterfaceC2053a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f12609a) {
            case 0:
                g gVar = (g) this.f12610b;
                Context context = (Context) this.c;
                String c = gVar.c();
                ?? obj = new Object();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 24) {
                    context = i4 >= 24 ? D.b.b(context) : null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + c, 0);
                boolean z4 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z4 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z4 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.f160a = z4;
                return obj;
            default:
                C1819f c1819f = (C1819f) this.f12610b;
                C1814a c1814a = (C1814a) this.c;
                InterfaceC1817d interfaceC1817d = c1814a.f14115f;
                ?? obj2 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<n3.i> set = c1814a.c;
                Set set2 = c1814a.f14116g;
                for (n3.i iVar : set) {
                    int i5 = iVar.c;
                    int i6 = iVar.f14133b;
                    boolean z5 = i5 == 0;
                    q qVar = iVar.f14132a;
                    if (z5) {
                        if (i6 == 2) {
                            hashSet4.add(qVar);
                        } else {
                            hashSet.add(qVar);
                        }
                    } else if (i5 == 2) {
                        hashSet3.add(qVar);
                    } else if (i6 == 2) {
                        hashSet5.add(qVar);
                    } else {
                        hashSet2.add(qVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(q.a(InterfaceC2015a.class));
                }
                obj2.f6659o = Collections.unmodifiableSet(hashSet);
                obj2.f6660p = Collections.unmodifiableSet(hashSet2);
                Collections.unmodifiableSet(hashSet3);
                obj2.f6661q = Collections.unmodifiableSet(hashSet4);
                Collections.unmodifiableSet(hashSet5);
                obj2.f6662r = c1819f;
                return interfaceC1817d.c(obj2);
        }
    }
}
