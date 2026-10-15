package t2;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2006m extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public Activity f14918a;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.f14918a;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f14918a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            super.startActivity(intent);
        }
    }
}
