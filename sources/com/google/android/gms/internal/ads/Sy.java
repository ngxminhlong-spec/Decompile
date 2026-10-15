package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Sy implements Ty {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7025o;

    /* renamed from: p, reason: collision with root package name */
    public final C0347Uc f7026p;

    public /* synthetic */ Sy(C0347Uc c0347Uc, int i4) {
        this.f7025o = i4;
        this.f7026p = c0347Uc;
    }

    @Override // com.google.android.gms.internal.ads.Ty
    public final Object o(String str) {
        switch (this.f7025o) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                for (int i5 = 0; i5 < 2; i5++) {
                    Provider provider = Security.getProvider(strArr[i5]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                int size = arrayList.size();
                while (true) {
                    C0347Uc c0347Uc = this.f7026p;
                    if (i4 >= size) {
                        return c0347Uc.f(str, null);
                    }
                    Object obj = arrayList.get(i4);
                    i4++;
                    try {
                        return c0347Uc.f(str, (Provider) obj);
                    } catch (Exception unused) {
                    }
                }
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                for (int i7 = 0; i7 < 3; i7++) {
                    Provider provider2 = Security.getProvider(strArr2[i7]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                int size2 = arrayList2.size();
                Exception exc = null;
                while (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    try {
                        return this.f7026p.f(str, (Provider) obj2);
                    } catch (Exception e4) {
                        if (exc == null) {
                            exc = e4;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }
}
