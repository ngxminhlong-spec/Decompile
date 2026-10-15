package h2;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13229o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Intent f13230p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f13231q;

    public /* synthetic */ p(Intent intent, Object obj, int i4) {
        this.f13229o = i4;
        this.f13230p = intent;
        this.f13231q = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, g2.f] */
    public final void a() {
        switch (this.f13229o) {
            case 0:
                Intent intent = this.f13230p;
                if (intent != null) {
                    ((GoogleApiActivity) this.f13231q).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f13230p;
                if (intent2 != null) {
                    this.f13231q.a(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e4) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e4);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
