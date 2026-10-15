package j2;

import N1.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import f2.g;
import f2.h;
import g2.m;
import h2.AbstractC1709h;
import h2.n;
import o2.AbstractC1895f;
import z2.C2133a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1731b extends AbstractC1895f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13330l;

    @Override // o2.AbstractC1895f
    public f2.c d(Context context, Looper looper, l lVar, Object obj, g gVar, h hVar) {
        switch (this.f13330l) {
            case 2:
                lVar.getClass();
                Integer num = (Integer) lVar.f1194u;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C2133a(context, looper, lVar, bundle, gVar, hVar);
            case 3:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.d(context, looper, lVar, obj, gVar, hVar);
        }
    }

    @Override // o2.AbstractC1895f
    public f2.c e(Context context, Looper looper, l lVar, Object obj, m mVar, m mVar2) {
        switch (this.f13330l) {
            case 0:
                return new C1733d(context, looper, lVar, (n) obj, mVar, mVar2);
            case 1:
                return new AbstractC1709h(context, looper, 300, lVar, mVar, mVar2);
            default:
                return super.e(context, looper, lVar, obj, mVar, mVar2);
        }
    }
}
