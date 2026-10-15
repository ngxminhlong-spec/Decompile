package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.C0470c9;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends C0470c9 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f12553p = 0;

    /* renamed from: o, reason: collision with root package name */
    public final Throwable f12554o;

    public d(int i4, Exception exc, int i5) {
        super(b(i4));
        this.f12554o = exc;
        Log.e("StorageException", "StorageException has occurred.\n" + b(i4) + "\n Code: " + i4 + " HttpResult: " + i5);
        if (exc != null) {
            Log.e("StorageException", exc.getMessage(), exc);
        }
    }

    public static d a(Status status) {
        int i4 = status.f3898o;
        y.b(true ^ (i4 <= 0));
        return new d(i4 == 16 ? -13040 : status.equals(Status.f3896t) ? -13030 : -13000, null, 0);
    }

    public static String b(int i4) {
        if (i4 == -13040) {
            return "The operation was cancelled.";
        }
        if (i4 == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i4 == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i4 == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i4 == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i4) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        Throwable th = this.f12554o;
        if (th == this) {
            return null;
        }
        return th;
    }
}
